package com.arqamahmad.blogsharedpreferences;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button button;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialisation
        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);





        //Button
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Reading data from EditText
                String value = editText.getText().toString();

                //Create or call the sharedPreference
                SharedPreferences preferences = getSharedPreferences("com.arqamahmad.filename",
                        MODE_PRIVATE);

                //Write in the Sharedpreferences file
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("key1",value);
                editor.commit();
                
                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
    }
}
