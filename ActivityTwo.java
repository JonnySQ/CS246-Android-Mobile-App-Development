package com.example.michaellongcrawford.week05;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = getIntent();
        String bookText = intent.getStringExtra("bookText");
        String chapterText = intent.getStringExtra("chapterText");
        String verseText = intent.getStringExtra("verseText");

        String fullText = bookText + " " + chapterText + ":" + verseText;


        //TextView textView = new TextView(this);
        //textView.setTextSize(40);
        //textView.setText(fullText);

        TextView textView = (TextView)findViewById(R.id.result);

        //textView.setTextSize(120);
        textView.setText(fullText);


        //ViewGroup layout = (ViewGroup) findViewById(R.id.content_activity_two);
        //layout.addView(textView);


        setContentView(R.layout.activity_two);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
