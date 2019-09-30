package com.geekbrains.a1l1;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Spinner;

public class DataSecondActivity implements View.OnClickListener {

    private Activity sourceActivity;

    public DataSecondActivity(Activity sourceActivity) {
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View v) {
        Spinner spinner = sourceActivity.findViewById(R.id.cities);
        CheckBox checkBoxTemp = sourceActivity.findViewById(R.id.checkTemp);
        CheckBox checkBoxHumidity = sourceActivity.findViewById(R.id.checkHumidity);
        CheckBox checkBoxWindy = sourceActivity.findViewById(R.id.checkWindy);
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra("City", (String) spinner.getSelectedItem());
        intent.putExtra("checkboxTemp", checkBoxTemp.isChecked());
        intent.putExtra("checkboxHum", checkBoxHumidity.isChecked());
        intent.putExtra("checkboxWindy", checkBoxWindy.isChecked());
        sourceActivity.startActivity(intent);
    }
}
