package com.example.pollkadot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class EmployeeLoginActivity extends AppCompatActivity {

    private EditText editText_email_employee;
    private EditText editText_password_employee;
    private Button butt_login_final_employee;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.employee_login_activity);
        editText_email_employee = (EditText) findViewById(R.id.edittext_email_employee);
        editText_password_employee = (EditText)findViewById(R.id.edittext_password_employee);
        butt_login_final_employee = (Button)findViewById(R.id.buttonLoginFinal_employee);
        int counter = 5;

        butt_login_final_employee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(editText_email_employee.getText().toString(), editText_password_employee.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){
        if((userName.equals("User")) && (userPassword.equals("1234"))){
            Intent in =new Intent(getApplicationContext(), poll_activity.class);
            startActivity(in);
        } else counter--;
        if (counter == 0){
            butt_login_final_employee.setEnabled(false);
        }
    }

}