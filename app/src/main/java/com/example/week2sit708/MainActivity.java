package com.example.week2sit708;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button myButton;
    EditText myEditText;
    TextView myTextView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //to do we connect that variable button with actual button
        myButton = findViewById(R.id.button);
        myEditText = findViewById(R.id.editTextTextPersonName);
        myTextView = findViewById(R.id.textView);

        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Todo Button acction
                String inputValue = myEditText.getText().toString();
                myTextView.setText("Welcome to SIT708"+inputValue);
                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_SHORT).show();
                Log.v("Check Message", "Successful Message");
            }
        });
    }

    public void clickMe(View view) {
    }
}