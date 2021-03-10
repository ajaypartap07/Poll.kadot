package com.example.pollkadot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butt_anon = (Button)findViewById(R.id.buttonLoginAnon);
        Button butt_mang = (Button)findViewById(R.id.buttonLoginManager);
        Button butt_emply = (Button)findViewById(R.id.buttonLoginEmployee);

        butt_anon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click_anon = new Intent(getApplicationContext(), poll_activity.class);
                startActivity(click_anon);
            }
        });
        butt_mang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click_anon = new Intent(getApplicationContext(), manager_login_activity.class);
                startActivity(click_anon);
            }
        });
        butt_emply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click_anon = new Intent(getApplicationContext(), EmployeeLoginActivity.class);
                startActivity(click_anon);
            }
        });
    }
}