package com.arqamahmad.blogsharedpreferences;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textView = (TextView)findViewById(R.id.textView);

        SharedPreferences preferences = getSharedPreferences("com.arqamahmad.filename",
                MODE_PRIVATE);
        String str = preferences.getString("key1","default Value");

        textView.setText(str);
    }
}
