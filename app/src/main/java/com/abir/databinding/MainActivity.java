package com.abir.databinding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;

import com.abir.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.roomResult.setText(R.string.result_stirng);
        activityMainBinding.roomSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.roomResult.setText(R.string.save_data_string);
            }
        });
        activityMainBinding.roomEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.roomResult.setText(R.string.edit_stirng);
            }
        });
        activityMainBinding.roomEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.roomResult.setText(R.string.edit_stirng);
            }
        });
        activityMainBinding.roomDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.roomResult.setText(R.string.Delete_stirng);
            }
        });
        activityMainBinding.roomDeleteAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityMainBinding.roomResult.setText(R.string.Deleteall_stirng);
            }
        });
    }
}
