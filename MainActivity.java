package com.example.mtmamaclay.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView display;
    Button easyButton, mediumButton, hardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        easyButton = (Button) findViewById(R.id.easy);
        mediumButton = (Button) findViewById(R.id.medium);
        hardButton = (Button) findViewById(R.id.hard);
        display = (TextView) findViewById(R.id.question);


        easyButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                display.setText("" + EasyGen());
            }
        });

        mediumButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                display.setText("" + MedGen());
            }
        });

    }

    public String EasyGen() {
        int firstNum;
        int secondNum;
        int operator;
        String opString = "N/a";
        String printedString;
        int answer;
        //public void generateVaues(){
        firstNum = 1 + (int)(Math.random() * 100);
        secondNum = 1 + (int)(Math.random() * 100);
        operator = 1 + (int)(Math.random() * 2);
        //}
        // public String generateEquation(){
        if(operator == 1) {
            opString = "+";
            answer = firstNum + secondNum;
        }else if(operator == 2) {
            opString = "-";
            answer = firstNum - secondNum;
        }
        printedString = firstNum + " " + opString + " " + secondNum;
        return printedString;
    }

    public String MedGen() {
        int firstNum;
        int secondNum;
        int operator;
        String opString = "N/A";
        int answer;
        String printedString = "n/A";

            firstNum = 1 + (int)(Math.random() * 100);
            secondNum = 1 + (int)(Math.random() * 100);
            operator = 1 + (int)(Math.random() * 4);



            if(operator == 1) {
                opString = "+";
                answer = firstNum + secondNum;
            }else if(operator == 2) {
                opString = "-";
                answer = firstNum - secondNum;
            }else if(operator == 3){
                opString = "*";
                answer = firstNum * secondNum;
            }else if(operator == 4){
                opString = "/";
                answer = firstNum / secondNum;
            }


        printedString = firstNum + " " + opString + " " + secondNum;
        return printedString;
    }
}
