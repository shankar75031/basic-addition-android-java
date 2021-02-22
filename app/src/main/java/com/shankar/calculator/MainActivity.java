package com.shankar.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edNum1;
    EditText edNum2;
    TextView tvSum;
    Button btAdd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edNum1 = findViewById(R.id.edNum1);
        edNum2 = findViewById(R.id.edNum2);
        btAdd = findViewById(R.id.btAdd);
        tvSum = findViewById(R.id.tvSum);


        btAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    int num1 = Integer.parseInt(edNum1.getText().toString());
                    int num2 = Integer.parseInt(edNum2.getText().toString());
                    int sum = Calculate.addNumbers(num1, num2);
                    tvSum.setText(String.valueOf(sum));
                }catch (Exception e){
                    tvSum.setText("Incorrect Inputs");
                }
            }
        });

    }
}
