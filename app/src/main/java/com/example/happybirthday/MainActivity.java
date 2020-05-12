package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);



        Button touchMeNa = findViewById(R.id.homeScreenButton);
        touchMeNa.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View  v)
            {
                goToBirthdayMessage();
            }
        });

    }

    private void goToBirthdayMessage()
    {
        Intent intent = new Intent(getApplicationContext(), BirthdayMessage.class);
        startActivity(intent);
        finish();
    }
}
