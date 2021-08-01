package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int randomNumber;
    public void genNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(50)+1;
   }
   public void guessNumber(View view) {
       EditText userInput = (EditText) findViewById(R.id.userInput);
       int guessValue = Integer.parseInt(userInput.getText().toString());
       Log.i("Entered Text", userInput.getText().toString());
       String message;
       if (guessValue > randomNumber) {
           message = "Lower";
       }
       else if (guessValue < randomNumber) {
           message = "Higher";
       }
       else {
           message = "Yeah You Got it!";
           genNumber();
       }
       Toast.makeText(this, message, Toast.LENGTH_SHORT).show();

       Log.i("Info", Integer.toString(randomNumber));
   }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        genNumber();
    }
}