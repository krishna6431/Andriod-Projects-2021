package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void convertCurrency(View view) {
        Log.i("info", "Button Pressed");
        EditText editText = (EditText) findViewById(R.id.editTextNumberDecimal);
        String amountInRs = editText.getText().toString();
        double amountInRsDouble = Double.parseDouble(amountInRs);
        double amountInDollarDouble = amountInRsDouble * 0.013;
        /*String amountInDollarString = Double.toString(amountInDollarDouble);*/
        @SuppressLint("DefaultLocale") String amountInDollarString = String.format("%.2f",amountInDollarDouble);
        /* Log.i("Amount in Dollar", amountInDollarString); */
        Toast.makeText(this, "₹" + amountInRs + " is $ " + amountInDollarString, Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}