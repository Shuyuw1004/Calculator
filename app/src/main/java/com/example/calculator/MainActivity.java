package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFunction_add(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(myTextField1.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int num3 = num1 + num2;

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(num3);

    }

    public void clickFunction_sub(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(myTextField1.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int num3 = num1 - num2;

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(num3);

    }

    public void clickFunction_multi(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(myTextField1.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int num3 = num1 * num2;

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(num3);

    }

    public void clickFunction_divide(View view) {

        EditText myTextField1 = (EditText) findViewById(R.id.myTextField1);
        EditText myTextField2 = (EditText) findViewById(R.id.myTextField2);

        int num1 = Integer.parseInt(myTextField1.getText().toString());
        int num2 = Integer.parseInt(myTextField2.getText().toString());

        int num3 = num1 / num2;

        //Toast.makeText(MainActivity.this, myTextField.getText().toString(), Toast.LENGTH_LONG).show();
        goToActivity2(num3);

    }

    public void goToActivity2(int num) {
        Intent intent = new Intent(this,MainActivity2.class);
        intent.putExtra("message", num);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}