package com.example.pollkadot;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;

public class poll_activity extends AppCompatActivity {
    //Initialize Variables

    private SeekBar seekBar1, seekBar2, seekBar3, seekBar4;
    private TextView tvOption1, tvOption2, tvOption3, tvOption4;
    private TextView percentOption1, percentOption2, percentOption3, percentOption4;
    private double count1=1, count2=1, count3=1, count4=1;
    private boolean flag1 = true, flag2 = true, flag3 = true, flag4 = true;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.poll_activity);
        //Assign Variables
        seekBar1 = (SeekBar)findViewById(R.id.voteOption1);
        seekBar2 = (SeekBar)findViewById(R.id.voteOption2);
        seekBar3 = (SeekBar)findViewById(R.id.voteOption3);
        seekBar4 = (SeekBar)findViewById(R.id.voteOption4);

        tvOption1 = (TextView)findViewById(R.id.option1_textview);
        tvOption2 = (TextView)findViewById(R.id.option2_textview);
        tvOption3 = (TextView)findViewById(R.id.option3_textview);
        tvOption4 = (TextView)findViewById(R.id.option4_textview);

        percentOption1 = (TextView)findViewById(R.id.option1_amt_textview);
        percentOption2 = (TextView)findViewById(R.id.option2_amt_textview);
        percentOption3 = (TextView)findViewById(R.id.option3_amt_textview);
        percentOption4 = (TextView)findViewById(R.id.option4_amt_textview);

        seekBar1.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        tvOption1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag1){
                    //when flag 1 is true
                    count1++;
                    count2=1;
                    count3=1;
                    count4=1;
                    flag1 = false;
                    flag2 = true;
                    flag3 = true;
                    flag4 = true;
                    //calculate percentage
                    calculatePercentage();
                }
            }
        });
        seekBar2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        tvOption2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag2){
                    //when flag 1 is true
                    count1=1;
                    count2++;
                    count3=1;
                    count4=1;
                    flag1 = true;
                    flag2 = false;
                    flag3 = true;
                    flag4 = true;
                    //calculate percentage
                    calculatePercentage();
                }
            }
        });
        seekBar3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        tvOption3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag3){
                    //when flag 1 is true
                    count1=1;
                    count2=1;
                    count3++;
                    count4=1;
                    flag1 = true;
                    flag2 = true;
                    flag3 = false;
                    flag4 = true;
                    //calculate percentage
                    calculatePercentage();
                }
            }
        });
        seekBar4.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return true;
            }
        });
        tvOption4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag4){
                    //when flag 1 is true
                    count1=1;
                    count2=1;
                    count3=1;
                    count4++;
                    flag1 = true;
                    flag2 = true;
                    flag3 = true;
                    flag4 = false;
                    //calculate percentage
                    calculatePercentage();
                }
            }
        });
    }

    private void calculatePercentage() {
        //calculate total
        double total = count1 + count2 + count3 +count4;
        //calculate %age of all options
        double percent1 = (count1/total)*100;
        double percent2 = (count2/total)*100;
        double percent3 = (count3/total)*100;
        double percent4 = (count4/total)*100;
        //set percent on TextView for percentOption1,2,3,4
        percentOption1.setText(String.format("%.0f%%", percent1));
        percentOption2.setText(String.format("%.0f%%", percent2));
        percentOption3.setText(String.format("%.0f%%", percent3));
        percentOption4.setText(String.format("%.0f%%", percent4));
        //set progress on seekBar
        seekBar1.setProgress((int) percent1);
        seekBar2.setProgress((int) percent2);
        seekBar3.setProgress((int) percent3);
        seekBar4.setProgress((int) percent4);

    }
}