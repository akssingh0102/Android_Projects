package com.example.higerorlower_game;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    protected void generateRandomNumber(){
        Random rand = new Random();
        randomNumber = rand.nextInt(20) +1;

    }

    public void randGenerator(View view){

        EditText editText_guess= (EditText) findViewById(R.id.editText_guess);


        int guess =Integer.parseInt(editText_guess.getText().toString());

        Log.i("Randdom Number",Integer.toHexString(randomNumber) );
        Log.i("Entered Number ", editText_guess.getText().toString());

        if(randomNumber>guess){
            Toast.makeText(this, "Higher !!", Toast.LENGTH_SHORT).show();
        }
        else if(randomNumber<guess){
            Toast.makeText(this, "Lower !!", Toast.LENGTH_SHORT).show();
        }
        else if(randomNumber==guess){
            Toast.makeText(this, "Vallah !! you Guessed the number  "+randomNumber +"Try Again", Toast.LENGTH_SHORT).show();
            generateRandomNumber();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}
