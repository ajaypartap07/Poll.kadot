package com.example.pollkadot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class manager_activity extends AppCompatActivity {
    private EditText editText_question_newPoll;
    private EditText editText_option_1;
    private EditText editText_option_2;
    private EditText editText_option_3;
    private EditText editText_option_4;
    private Button butt_create_new_poll;
    private Button butt_view_current_polls;
    private Button butt_view_poll_results;
    private int counter = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manager_activity);

        butt_create_new_poll = (Button)findViewById(R.id.buttonCreatePoll);
        butt_view_current_polls = (Button)findViewById(R.id.buttonCurrentPolls);
        butt_view_poll_results = (Button)findViewById(R.id.buttonPollResults);
        editText_question_newPoll = (EditText) findViewById(R.id.editText_Question);
        editText_option_1 = (EditText) findViewById(R.id.editText_option1);
        editText_option_2 = (EditText) findViewById(R.id.editText_option2);
        editText_option_3 = (EditText) findViewById(R.id.editText_option3);
        editText_option_4 = (EditText) findViewById(R.id.editText_option4);

        butt_view_current_polls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click_anon = new Intent(getApplicationContext(), poll_activity.class);
                startActivity(click_anon);
            }
        });
    }
}