package com.example.privacy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class calculator extends AppCompatActivity {
    private TextView resultTextView;
    private StringBuilder inputStringBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        resultTextView = findViewById(R.id.resultTextView);
        inputStringBuilder = new StringBuilder();
    }


    public void onButtonClicked(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();

        if (buttonText.equals("=")) {
            // Perform calculation
            try {
                double result = evaluateExpression(inputStringBuilder.toString());
                resultTextView.setText(String.valueOf(result));
            } catch (Exception e) {
                resultTextView.setText("Error");
            }

            inputStringBuilder.setLength(0);
        } else if (buttonText.equals("C")) {
            // Clear the input
            inputStringBuilder.setLength(0);
            resultTextView.setText("0");
        } else {
            // Append the clicked button's text to the input string
            inputStringBuilder.append(buttonText);
            resultTextView.setText(inputStringBuilder.toString());
        }
    }

    private double evaluateExpression(String expression) {
        return new ExpressionBuilder(expression).build().evaluate();
    }
}
