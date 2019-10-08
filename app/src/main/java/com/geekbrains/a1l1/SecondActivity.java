package com.geekbrains.a1l1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        Intent data = getIntent();
        String text = data.getExtras().getString("City");
        TextView textView = findViewById(R.id.textCitySecond);
        textView.setText(text);

        if (data.getBooleanExtra("checkboxTemp", true)) {
            getTemperature();
        }
        if (data.getBooleanExtra("checkboxHum", true)) {
            getHumidity();
        }
        if (data.getBooleanExtra("checkboxWindy", true)) {
            getWindy();
        }
    }

    private void getWindy() {
        TextView textWindy = findViewById(R.id.textViewWindy);
        textWindy.setText(R.string.itemWindy);
    }

    private void getHumidity() {
        TextView textHum = findViewById(R.id.textHumidity);
        textHum.setText(R.string.itemHumidity);
    }

    private void getTemperature() {
        TextView textTemp = findViewById(R.id.textTemp);
        textTemp.setText(R.string.itemTemperature);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }
}
