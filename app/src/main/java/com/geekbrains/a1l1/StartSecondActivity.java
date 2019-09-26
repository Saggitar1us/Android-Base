package com.geekbrains.a1l1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import static org.xmlpull.v1.XmlPullParser.TEXT;

public class StartSecondActivity implements View.OnClickListener {
    private Activity sourceActivity;

    public StartSecondActivity(Activity sourceActivity) {
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        EditText editText = sourceActivity.findViewById(R.id.editTextCity);
        CheckBox checkBoxTemp = sourceActivity.findViewById(R.id.checkTemp);
        CheckBox checkBoxHumidity = sourceActivity.findViewById(R.id.checkHumidity);
        CheckBox checkBoxWindy = sourceActivity.findViewById(R.id.checkWindy);
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra(String.valueOf(TEXT), editText.getText().toString());
        intent.putExtra("checkboxTemp", checkBoxTemp.isChecked());
        intent.putExtra("checkboxHum", checkBoxHumidity.isChecked());
        intent.putExtra("checkboxWindy", checkBoxWindy.isChecked());
        sourceActivity.startActivity(intent);
    }
}