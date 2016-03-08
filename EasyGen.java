package com.example.sephiroth.myapplication;
import java.util.Random;
/**
 * Created by Steven on 16-03-08.
 */
public class EasyGen {
    int firstNum;
    int secondNum;
    int operator;
    String opString;
    int answer;
    public void generateValues(){
        this.firstNum = 1 + (int)(Math.random() * 100);
        this.secondNum = 1 + (int)(Math.random() * 100);
        this.operator = 1 + (int)(Math.random() * 2);
    }

    public void generateEquation(){
        if(operator == 1) {
            opString = "+";
            answer = firstNum + secondNum;
        }else if(operator == 2) {
            opString = "-";
            answer = firstNum - secondNum;
        }
    }

    public void printQuestion(){
        System.out.println(firstNum + " " + opString + " " + secondNum + " = ");
    }
}
