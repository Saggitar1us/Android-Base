package com.geekbrains.a1l1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static org.xmlpull.v1.XmlPullParser.TEXT;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent data = getIntent();
        String text = data.getExtras().getString(String.valueOf(TEXT));
        TextView textView = (TextView) findViewById(R.id.textCitySecond);
        textView.setText(text);

        if (data.getBooleanExtra("checkboxTemp", true)) {
            TextView textTemp = findViewById(R.id.textTemp);
            textTemp.setText("Температура +13");
        }
        if (data.getBooleanExtra("checkboxHum", true)) {
            TextView textHum = findViewById(R.id.textHumidity);
            textHum.setText("Влажность воздуха 67 %");
        }
        if (data.getBooleanExtra("checkboxWindy", true)) {
            TextView textWindy = findViewById(R.id.textViewWindy);
            textWindy.setText("Скорость ветра 5 м/с");
        }
        Toast.makeText(getApplicationContext(), "Second - onCreate()", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Second - onStart()", Toast.LENGTH_SHORT).show();
    }
}
