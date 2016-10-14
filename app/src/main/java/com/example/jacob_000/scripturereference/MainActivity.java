package com.example.jacob_000.scripturereference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    EditText book;
    EditText chapter;
    EditText verse;

    Button combineB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        book = (EditText) findViewById(R.id.bookText);
        chapter = (EditText) findViewById(R.id.chapterText);
        verse = (EditText) findViewById(R.id.verseText);

        combineB = (Button) findViewById(R.id.combineB);
        combineB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                i.putExtra("book", book.getText().toString());
                i.putExtra("chapter", chapter.getText().toString());
                i.putExtra("verse", verse.getText().toString());

                startActivity(i);
            }
        });
    }
}
