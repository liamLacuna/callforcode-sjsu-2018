package com.example.cindyxue.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.colorPrimary)
                );
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.orange)
                );
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userInput = ((EditText) findViewById(R.id.editText)).getText().toString();

                if(TextUtils.isEmpty(userInput))
                {
                    ((TextView) findViewById(R.id.textView)).setText("Hello from Xueer (Cindy) Xue");
                }
                else
                {
                    ((TextView) findViewById(R.id.textView)).setText(userInput);
                }
            }
        });

        findViewById(R.id.rootView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //reset the text color back to black
                //reset the background color back to colorAccent
                //reset the label back to "Hello from Xueer (Cindy) Xue"
                ((TextView) findViewById(R.id.textView)).setText("Hello from Xueer (Cindy) Xue");
                ((TextView) findViewById(R.id.textView)).setTextColor(
                        getResources().getColor(R.color.black)
                );
                findViewById(R.id.rootView).setBackgroundColor(
                        getResources().getColor(R.color.colorAccent)
                );

            }
        });
    }
}
