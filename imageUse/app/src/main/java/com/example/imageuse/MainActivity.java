package com.example.imageuse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void switchImage(View view){

        Log.i("Info", "button Pressed!!");

        ImageView image = (ImageView) findViewById(R.id.OneImageView);
        image.setImageResource(R.drawable.oceanimage1);

        Toast.makeText(this, "Image Switched successfully", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
