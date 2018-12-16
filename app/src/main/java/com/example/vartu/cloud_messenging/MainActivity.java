package com.example.vartu.cloud_messenging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    StringBuilder text = new StringBuilder("");
    private TextView data;
    msg node=new msg();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        data = (TextView) findViewById(R.id.data);
        setNotificationData(getIntent().getExtras());


    }

    private void setNotificationData(Bundle extras) {
        if (extras == null)
            return;

        text.append("Message Details:");
        text.append("\n");
        text.append("\n");
        if (extras.containsKey("title")) {
            text.append("Title: ");
            text.append(extras.get("title"));
        }
        text.append("\n");
        if (extras.containsKey("message")) {
            text.append("Message: ");
            text.append(extras.get("message"));
        }
        text.append("\n");
        text.append("\n");
        data.setText(text);
    }
}