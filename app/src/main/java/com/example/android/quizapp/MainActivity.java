package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import static android.R.attr.duration;
import static com.example.android.quizapp.R.string.q5a1;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // this method is called when the submit button is pressed
    public void submitGrade(View view) {

        // initial score
        int correct = 0;

        // check question 1
        RadioButton q1a1State = (RadioButton) findViewById(R.id.q1a1);
        boolean q1a1 = q1a1State.isChecked();

        // check question 2
        CheckBox q2a1State = (CheckBox) findViewById(R.id.q2a1);
        boolean q2a1 = q2a1State.isChecked();
        CheckBox q2a2State = (CheckBox) findViewById(R.id.q2a2);
        boolean q2a2 = q2a2State.isChecked();
        CheckBox q2a3State = (CheckBox) findViewById(R.id.q2a3);
        boolean q2a3 = q2a3State.isChecked();
        CheckBox q2a4State = (CheckBox) findViewById(R.id.q2a4);
        boolean q2a4 = q2a4State.isChecked();
        CheckBox q2a5State = (CheckBox) findViewById(R.id.q2a5);
        boolean q2a5 = q2a5State.isChecked();

        // check question 3
        RadioButton q3a1State = (RadioButton) findViewById(R.id.q3a1);
        boolean q3a1 = q3a1State.isChecked();

        // check question 4
        EditText q4a1_input = (EditText) findViewById(R.id.q4a1);
        String q4a1 = q4a1_input.getText().toString();

        // check question 5
        EditText q5a1_input = (EditText) findViewById(R.id.q5a1);
        String q5a1 = q5a1_input.getText().toString();

        // check question 6
        RadioButton q6a1State = (RadioButton) findViewById(R.id.q6a1);
        boolean q6a1 = q6a1State.isChecked();

        // check question 7
        RadioButton q7a1State = (RadioButton) findViewById(R.id.q7a2);
        boolean q7a1 = q7a1State.isChecked();

        //check question 8
        RadioButton q8a1State = (RadioButton) findViewById(R.id.q8a1);
        boolean q8a1 = q8a1State.isChecked();

        // check question 9
        EditText q9a1_input = (EditText) findViewById(R.id.q9a1);
        String q9a1 = q9a1_input.getText().toString();

        // check question 10
        RadioButton q10a2State = (RadioButton) findViewById(R.id.q10a2);
        boolean q10a2 = q10a2State.isChecked();

        // this method takes the user input to calculate the score
        correct = calculateGrade(q1a1, q2a1, q2a2, q2a3, q2a4, q2a5, q3a1, q4a1, q5a1, q6a1, q7a1, q8a1, q9a1, q10a2, correct);

        // this method displays the final score and a message based on the score
        scoreViewer(correct);
    }


    // This method us used to calculate the score based on the user input, and then passes that score to the scoreViewer
    public int calculateGrade(boolean q1a1,
                              boolean q2a1,
                              boolean q2a2,
                              boolean q2a3,
                              boolean q2a4,
                              boolean q2a5,
                              boolean q3a1,
                              String q4a1,
                              String q5a1,
                              boolean q6a1,
                              boolean q7a2,
                              boolean q8a1,
                              String q9a1,
                              boolean q10a2,
                              int correct){

        if (q1a1)
            correct ++;
        if (q2a1 && q2a2 && !q2a3 && !q2a4 && !q2a5)
            correct ++;
        if (q3a1)
            correct ++;
        if (q4a1.equalsIgnoreCase("missi dominici"))
            correct ++;
        if (q5a1.equalsIgnoreCase("vassal"))
            correct ++;
        if (q6a1)
            correct ++;
        if (q7a2)
            correct ++;
        if (q8a1)
            correct ++;
        if (q9a1.equalsIgnoreCase("Hastings"))
            correct ++;
        if (q10a2)
            correct ++;

        return correct;
    }

    // This method receives the final score from calculateGrade and displays a toast based on that score.
    public void scoreViewer(int correct) {
        Context context = getApplicationContext();
        CharSequence text ="";

        if (correct == 10)
            text = correct + " out 10 correct?! Get out of the library nerd!";
        else if(correct > 6)
            text = correct + " out 10 correct! You passed!";
        else
            text = correct + " out of 10 correct. Looks like you need to study a little more.";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}

