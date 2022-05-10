package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        configureBackButton();
    }

    private void configureBackButton()
    {
        Button backButton = (Button) findViewById(R.id.Scn2BackButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            } // end nested inner method
        }); // end Listener method
    } // end button configuration
} // end SecondActivity class