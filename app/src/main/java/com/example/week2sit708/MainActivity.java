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
                //Todo Get the value of mEditText
                String inputValue = myEditText.getText().toString();

                //Todo Make a Toast to display inputValue.
                Toast.makeText(MainActivity.this, "Hi Again", Toast.LENGTH_LONG).show();
                Toast.makeText(MainActivity.this, inputValue, Toast.LENGTH_LONG).show();

                //Todo Change the value ot mTextView
                myTextView.setText("This is new text");
                myTextView.setText("Welcome to SIT708 "+ inputValue);
                Log.v("Check Message", "Successful Message");
            }
        });
    }

    public void clickMe(View view) {
    }
}