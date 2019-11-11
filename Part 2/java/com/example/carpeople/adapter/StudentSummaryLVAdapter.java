package com.example.carpeople.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.carpeople.R;
import com.example.carpeople.StudentDetailActivity;
import com.example.carpeople.model.Student;
import com.example.carpeople.model.StudentDB;

public class StudentSummaryLVAdapter extends BaseAdapter {

    @Override
    public int getCount(){return StudentDB.getInstance().getStudents().size();}

    @Override
    public Object getItem(int i){return StudentDB.getInstance().getStudents().get(i);}

    @Override
    public long getItemId(int i){return i;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){

        View row_view;

        if (view == null) {
            // cnt++;
            LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
            row_view = inflater.inflate(R.layout.student_row, viewGroup, false);
        } else row_view = view;

        Student p = StudentDB.getInstance().getStudents().get(i);

        TextView firstNameView = (TextView) row_view.findViewById(R.id.first_name);
        firstNameView.setText(p.getFirstName());
        TextView lastNameView = (TextView) row_view.findViewById(R.id.last_name);
        lastNameView.setText(p.getLastName());
        TextView cwid = (TextView) row_view.findViewById(R.id.cwid);
        cwid.setText(Integer.toString(p.getCWID()));

        row_view.setTag(new Integer(i));

        row_view.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        //
                        Intent intent = new Intent(view.getContext(), StudentDetailActivity.class);
                        intent.putExtra("StudentIndex", ((Integer)view.getTag()).intValue());
                        view.getContext().startActivity(intent);
                    }
                }
        );

        return row_view;


    }
}
