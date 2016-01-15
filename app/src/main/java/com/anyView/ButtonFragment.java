package com.anyView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.Fragment;

import engineering.R;

/**
 * Created by sd on 2015/11/25.
 */
public class ButtonFragment extends Fragment {


    Button myButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.guide_1, container, false);//关联布局文件

        myButton = (Button) rootView.findViewById(R.id.mybutton);//根据rootView找到button

        //设置按键监听事件
        myButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(ButtonFragment.this.getActivity(), "button is click!", Toast.LENGTH_SHORT).show();
            }
        });


        return rootView;
    }
}
