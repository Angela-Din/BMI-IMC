package com.meineapp.kabbadesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText heightIn, weightIn;
    private TextView bmiOut;
    private Button buttonCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        heightIn = (EditText) findViewById(R.id.heightInNumber);
        weightIn = (EditText) findViewById(R.id.weightInNumber);
        bmiOut = (TextView) findViewById(R.id.bmiOut);
        buttonCalcular = (Button) findViewById(R.id.buttonCalcular);

        buttonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String height1 = heightIn.getText().toString();
                String weight1 = weightIn.getText().toString();

                double height = Integer.parseInt(height1);
                double weight = Integer.parseInt(weight1);

                double bmi = weight / (height * height) * 10000;
                bmiOut.setText(String.format("%.2f",bmi));
            }
        });
    }
}