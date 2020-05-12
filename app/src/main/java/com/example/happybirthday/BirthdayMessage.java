package com.example.happybirthday;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BirthdayMessage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_birthday_message);

        Intent intent= new Intent(getApplicationContext(), MusicPlayerService.class);
        startService(intent);

        Button idharChhu = findViewById(R.id.birthday_message_acivity_button);
        idharChhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToImageActivity();
            }
        });
    }

    private void goToImageActivity()
    {
        Intent intent = new Intent(getApplicationContext(), Image_Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        stopService(new Intent(getApplicationContext(), MusicPlayerService.class));
    }
}
