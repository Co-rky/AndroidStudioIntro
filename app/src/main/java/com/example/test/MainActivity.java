package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int numDucks = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configureNextButton();
    }

    public void upClick(View v)
    {
        Toast.makeText(this, "You have clicked the up button", Toast.LENGTH_SHORT).show();
        numDucks++;
        updateTextView();

        // Log.i("info", "DOES THE INFO WORK??!!!!!");
    } // end up count button handler

    public void downClick(View v)
    {
        Toast.makeText(this, "You have clicked the down button", Toast.LENGTH_SHORT).show();
        numDucks--;
        updateTextView();
    } // end down count button handler

    public void openDialog (View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Confirm reset count");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(MainActivity.this, "YESSIRREE Bob", Toast.LENGTH_SHORT).show();
                numDucks = 0;
                // need to update text again
                updateTextView();
            } // end onClick overriden method
        }); // end set positive or "Yes" button handler

        builder.setNegativeButton("No Way Jose!", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Method is empty because all it needs to do is close the dialog
            } // end onClick
        }); // end set negative button

        AlertDialog resetDialog = builder.create();
        resetDialog.show();
    } // end open dialog handler

    public void updateTextView()
    {
        TextView countTextView = (TextView) findViewById(R.id.countLabelView);
        countTextView.setText("Number of EagleDucks: " + numDucks);
    }

    private void configureNextButton()
    {
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SecondScreen.class));
            }
        });
    } // end nextButton handler


} // end mainActivity class






