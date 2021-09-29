package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    boolean point = false;
    double number1 = 0, number2 = 0, poi = 1;
    String action = "";
    TextView txtV;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtV = findViewById(R.id.resolt);
    }

    public void onClickPoint(View view){
        if(!point){
            point = true;
        }
    }

    public void onClickDiv(View view){
        if(action == ""){
            number1 /= poi;
            point = false;
            poi = 1;
        }
        action = "/";
        txtV.setText(number1 + action + (number2 / poi) );
    }
    public void onClickMult(View view){
        if(action == ""){
            number1 /= poi;
            point = false;
            poi = 1;
        }
        action = "*";
        txtV.setText(number1 + action + (number2 / poi) );
    }
    public void onClickIMinus(View view){
        if(action == ""){
            number1 /= poi;
            point = false;
            poi = 1;
        }
        action = "-";
        txtV.setText(number1 + action + (number2 / poi) );
    }
    public void onClickPlus(View view){
        if(action == ""){
            number1 /= poi;
            point = false;
            poi = 1;
        }
        action = "+";
        txtV.setText(number1 + action + (number2 / poi) );
    }

    public void onClickRes(View view){
        number2 /= poi;
        double rez = 0;
        if(action == "/")
        {
            if(number2 != 0){
                rez = number1 / number2;
                txtV.setText(number1 + action + number2 + "=" +  rez);
            }
            else {
                txtV.setText("Cannot be divided by zero.");
            }
        }
        else if(action == "*")
        {
            rez = number1 * number2;
            txtV.setText(number1 + action + number2 + "=" +  rez);
        }
        else if(action == "-")
        {
            rez = number1 - number2;
            txtV.setText(number1 + action + number2 + "=" +  rez);
        }
        else if(action == "+")
        {
            rez = number1 + number2;
            txtV.setText(number1 + action + number2 + "=" +  rez);
        }
        point = false;
        poi = 1;
    }
    public void onClickDel(View view){
        number1 = 0;
        number2 = 0;
        point = false;
        poi = 1;
        action = "";
        txtV.setText("0");
    }



    public void onClickZero(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 0;
            }
            else {
                number1 *= 10;
                number1 += 0;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 0;
            }
            else {
                number2 *= 10;
                number2 += 0;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }

    }
    public void onClickOne(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 1;
            }
            else {
                number1 *= 10;
                number1 += 1;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 1;
            }
            else {
                number2 *= 10;
                number2 += 1;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickTwo(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 2;
            }
            else {
                number1 *= 10;
                number1 += 2;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 2;
            }
            else {
                number2 *= 10;
                number2 += 2;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickThree(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 3;
            }
            else {
                number1 *= 10;
                number1 += 3;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 3;
            }
            else {
                number2 *= 10;
                number2 += 3;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickFour(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 4;
            }
            else {
                number1 *= 10;
                number1 += 4;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 4;
            }
            else {
                number2 *= 10;
                number2 += 4;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickFive(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 5;
            }
            else {
                number1 *= 10;
                number1 += 5;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 5;
            }
            else {
                number2 *= 10;
                number2 += 5;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickSix(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 6;
            }
            else {
                number1 *= 10;
                number1 += 6;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 6;
            }
            else {
                number2 *= 10;
                number2 += 6;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickSeven(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 7;
            }
            else {
                number1 *= 10;
                number1 += 7;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 7;
            }
            else {
                number2 *= 10;
                number2 += 7;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickEight(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 8;
            }
            else {
                number1 *= 10;
                number1 += 8;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 8;
            }
            else {
                number2 *= 10;
                number2 += 8;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
    public void onClickNine(View view){
        if(action == "")
        {
            if(number1 == 0){
                number1 = 9;
            }
            else {
                number1 *= 10;
                number1 += 9;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText((number1 / poi) + "");
        }
        else{
            if(number2 == 0){
                number2 = 9;
            }
            else {
                number2 *= 10;
                number2 += 9;
            }
            if(point){
                poi*= 10;
            }
            txtV.setText(number1 + action + (number2 / poi) );
        }
    }
}