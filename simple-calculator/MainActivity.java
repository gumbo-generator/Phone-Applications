package com.pegasus.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //set objects
        EditText firstNumber = findViewById(R.id.number1);
        EditText secondNumber = findViewById(R.id.number2);
        RadioGroup operators = findViewById(R.id.radioGroup);
        RadioButton add = findViewById(R.id.add);
        RadioButton subtract = findViewById(R.id.subtract);
        RadioButton multiply = findViewById(R.id.multiply);
        RadioButton divide = findViewById(R.id.divide);
        Button equals = findViewById(R.id.equals);
        TextView result = findViewById(R.id.result);

        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int firstNumberValue = Integer.parseInt(firstNumber.getText().toString());
                final int secondNumberValue = Integer.parseInt(secondNumber.getText().toString());

                //calculation
                final int operatorButtonId = operators.getCheckedRadioButtonId();
                Integer answer = null;
                if (operatorButtonId == add.getId()){
                    answer = firstNumberValue + secondNumberValue;
                }
                if (operatorButtonId == subtract.getId()){
                    answer = firstNumberValue - secondNumberValue;
                }
                if (operatorButtonId == multiply.getId()){
                    answer = firstNumberValue * secondNumberValue;
                }
                if (operatorButtonId == divide.getId()){
                    answer = firstNumberValue / secondNumberValue;
                }
                
                result.setText(answer.toString());
            }
        });
    }
}