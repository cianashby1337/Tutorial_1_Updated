package com.example.tutorial1updated_basics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private boolean imageO1Displayed = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent loginInformation = getIntent();
        String username = loginInformation.getStringExtra("username");

        String password = loginInformation.getStringExtra("password");

        TextView welcomeMessage = findViewById(R.id.welcomeMessage);

        welcomeMessage.setText("Welcome " + username + "! and your password is: " + password);
    }

    public void button1Click(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }

    public void onButton2Click(View view) {
        //Snackbar.make(view, "The second button has been clicked!", Snackbar.LENGTH_SHORT).show();
        Toast.makeText(this,"The second button has been clicked AGAIN!!", Toast.LENGTH_SHORT).show();

        ImageView imageBox = findViewById(R.id.imageView2);
        if(imageO1Displayed) {

            imageBox.setImageResource(R.drawable.image02);
            imageO1Displayed = false;
        }
        else {

            imageBox.setImageResource(R.drawable.image01);
            imageO1Displayed = true;
        }
    }
}