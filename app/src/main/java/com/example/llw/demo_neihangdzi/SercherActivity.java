package com.example.llw.demo_neihangdzi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SercherActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonBackMainactivity;
    private EditText editSercher;
    private Button btnStartSercher;

    private void assignViews() {
        buttonBackMainactivity = (Button) findViewById(R.id.button_back_mainactivity);
        editSercher = (EditText) findViewById(R.id.edit_sercher);
        btnStartSercher = (Button) findViewById(R.id.btn_start_sercher);
        buttonBackMainactivity.setOnClickListener(this);
        btnStartSercher.setOnClickListener(this);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sercher);
        assignViews();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_back_mainactivity:
                startActivity(new Intent(this, MainActivity.class));
                break;
            case R.id.btn_start_sercher:

                break;
        }
    }
}
