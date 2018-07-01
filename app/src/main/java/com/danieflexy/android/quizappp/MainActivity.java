package com.danieflexy.android.quizappp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Displaying logo with title by the side
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        getSupportActionBar().setTitle("   Quiz App");

    }

    public int textScore() {
        //Gets user input
        EditText editText = (EditText) findViewById(R.id.answer1EditText);
        EditText editText1 = (EditText) findViewById(R.id.handEditText);
        //and casting input into string and removing excess spaces
        String getText1 =  editText.getText().toString().trim();
        String getText2 = editText1.getText().toString().trim();

        CheckBox checkEng = (CheckBox) findViewById(R.id.engCheck);
        CheckBox checkFre = (CheckBox) findViewById(R.id.freCheck);
        CheckBox checkSpan = (CheckBox) findViewById(R.id.spanCheck);
        CheckBox checkhaus = (CheckBox) findViewById(R.id.hauCheck);
        CheckBox checkMed = (CheckBox) findViewById(R.id.medCheck);
        CheckBox checkRed = (CheckBox) findViewById(R.id.redCheck);
        CheckBox checkLake = (CheckBox) findViewById(R.id.lakeCheck);
        CheckBox checkBlue = (CheckBox) findViewById(R.id.blueCheck);

        RadioButton radAnkara =(RadioButton) findViewById(R.id.ankaraRadio);
        RadioButton radBat = (RadioButton) findViewById(R.id.batmanRadio);

        int score = 0;

        if(getText1.equalsIgnoreCase("Telescope")){
            score ++ ;
        }

        if (getText2.equalsIgnoreCase("1986")){
            score ++ ;
        }

        if (checkEng.isChecked() && checkFre.isChecked() && !checkhaus.isChecked() && !checkSpan.isChecked())
        {
            score ++;
        }

        if (checkMed.isChecked() && checkRed.isChecked()&& !checkBlue.isChecked() && !checkLake.isChecked()){
            score ++;
        }

        if(radAnkara.isChecked())
        {
            score++;
        }

        if(radBat.isChecked())
        {
            score++;
        }
        return  score;
    }

    public void submit(View view){
              //Displays the results
        Toast.makeText(this,"Your total Score for this quiz is: " + textScore(),Toast.LENGTH_SHORT).show();
    }
}
