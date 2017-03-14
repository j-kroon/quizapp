package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static com.example.android.quizapp.R.string.q5a1;

public class MainActivity extends AppCompatActivity {

    int correct = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitGrade(View view) {
        correct = 0;
        RadioButton q1a1State = (RadioButton) findViewById(R.id.q1a1);
        boolean q1a1 = q1a1State.isChecked();

        CheckBox q2a1State = (CheckBox) findViewById(R.id.q2a1);
        boolean q2a1 = q2a1State.isChecked();
        CheckBox q2a2State = (CheckBox) findViewById(R.id.q2a2);
        boolean q2a2 = q2a2State.isChecked();

        RadioButton q3a1State = (RadioButton) findViewById(R.id.q3a1);
        boolean q3a1 = q3a1State.isChecked();

        EditText q4a1_input = (EditText) findViewById(R.id.q4a1);
        String q4a1 = q4a1_input.getText().toString();

        EditText q5a1_input = (EditText) findViewById(R.id.q5a1);
        String q5a1 = q5a1_input.getText().toString();

        RadioButton q6a1State = (RadioButton) findViewById(R.id.q6a1);
        boolean q6a1 = q6a1State.isChecked();

        RadioButton q7a1State = (RadioButton) findViewById(R.id.q7a2);
        boolean q7a1 = q7a1State.isChecked();

        RadioButton q8a1State = (RadioButton) findViewById(R.id.q8a1);
        boolean q8a1 = q8a1State.isChecked();

        EditText q9a1_input = (EditText) findViewById(R.id.q9a1);
        String q9a1 = q9a1_input.getText().toString();

        RadioButton q10a2State = (RadioButton) findViewById(R.id.q10a2);
        boolean q10a2 = q10a2State.isChecked();


        calculateGrade(q1a1, q2a1, q2a2, q3a1, q4a1, q5a1, q6a1, q7a1, q8a1, q9a1, q10a2);

        Context context = getApplicationContext();
        CharSequence text = correct + " out 10 correct!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
            toast.show();
    }

    private int calculateGrade(boolean q1a1,
                               boolean q2a1,
                               boolean q2a2,
                               boolean q3a1,
                               String q4a1,
                               String q5a1,
                               boolean q6a1,
                               boolean q7a2,
                               boolean q8a1,
                               String q9a1,
                               boolean q10a2){

        if (q1a1)
            correct += 1;
        if (q2a1 && q2a2)
            correct += 1;
        if (q3a1)
            correct += 1;
        if (q4a1.equals("missi dominici"))
            correct += 1;
        if (q5a1.equals("vassal"))
            correct += 1;
        if (q6a1)
            correct += 1;
        if (q7a2)
            correct += 1;
        if (q8a1)
            correct += 1;
        if (q9a1.equals("Hastings"))
            correct += 1;
        if (q10a2)
            correct += 1;

        return correct;
    }
}

