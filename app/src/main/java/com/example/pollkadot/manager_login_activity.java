package com.example.pollkadot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class manager_login_activity extends AppCompatActivity {
    private EditText editText_email;
    private EditText editText_password;
    private Button butt_login_final;
    private int counter = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_login_activity);

        editText_email = (EditText) findViewById(R.id.edittextemail);
        editText_password = (EditText)findViewById(R.id.edittextpassword);
        butt_login_final = (Button)findViewById(R.id.buttonLoginFinal);
        int counter = 5;

        butt_login_final.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(editText_email.getText().toString(), editText_password.getText().toString());
            }
        });
    }
    private void validate(String userName, String userPassword){
        if((userName.equals("Admin")) && (userPassword.equals("1234"))){
            Intent in =new Intent(getApplicationContext(), manager_activity.class);
            startActivity(in);
        } else counter--;
        if (counter == 0){
            butt_login_final.setEnabled(false);
        }
    }

}