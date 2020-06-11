package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view){

        EditText amountEditText = (EditText) findViewById(R.id.amountEditText);

        Log.i("Info", "Button Presses!!");

        double converted_currency;

        String value= amountEditText.getText().toString();
        converted_currency = Double.parseDouble(value);

        converted_currency = converted_currency*75.52;

        Toast.makeText(this, "In dollars "+ converted_currency, Toast.LENGTH_SHORT).show();



    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
