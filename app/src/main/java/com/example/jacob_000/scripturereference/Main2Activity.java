package com.example.jacob_000.scripturereference;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Bundle extras = getIntent().getExtras();

        if(extras != null) {
            String book = extras.getString("book");
            String chapter = extras.getString("chapter");
            String verse = extras.getString("verse");

            String reference = "Your Favorite Scripture is " + book + " " + chapter + ":" + verse;

            TextView result = (TextView) findViewById(R.id.resultText);

            result.setText(reference);
        }
    }
}
