package com.faravy.bitmtrainer401.explicitintent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView showTextView;

    String text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        showTextView = (TextView) findViewById(R.id.showText);
        text = getIntent().getStringExtra("message");
        showTextView.setText(text);


    }
}
