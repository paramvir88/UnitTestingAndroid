package com.example.paramvir.unittestingsample;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CalculatorActivity extends AppCompatActivity {


    @BindView(R.id.button_one)
    TextView oneButton;

    @BindView(R.id.button_two)
    TextView twoButton;
    @BindView(R.id.button_three)
    TextView threeButton;

    @BindView(R.id.button_four)
    TextView fourButton;

    @BindView(R.id.button_five)
    TextView fiveButton;

    @BindView(R.id.button_six)
    TextView sixButton;

    @BindView(R.id.button_seven)
    TextView sevenButton;

    @BindView(R.id.button_eight)
    TextView eightButton;

    @BindView(R.id.button_nine)
    TextView nineButton;

    @BindView(R.id.button_zero)
    TextView zeroButton;

    @BindView(R.id.button_equals)
    TextView equalButton;

    @BindView(R.id.button_minus)
    TextView minusButton;

    @BindView(R.id.button_multiply)
    TextView multiplyButton;

    @BindView(R.id.button_division)
    TextView divisionButton;

    @BindView(R.id.button_plus)
    TextView plusButton;

    @BindView(R.id.tv_input)
    TextView inputTv;

    @BindView(R.id.tv_result)
    TextView resultTv;

    int leftOperand;
    int rightOperand;
    int result;


    Calculator calculator = new Calculator();


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ButterKnife.bind(this);

        oneButton.setOnClickListener(view -> {
            inputTv.setText(inputTv.getText().toString() + "1");

        });
        twoButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "2"));
        threeButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "3"));
        fourButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "4"));
        fiveButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "5"));
        sixButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "6"));
        sevenButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "7"));
        eightButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "8"));
        nineButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "9"));
        zeroButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "0"));
        plusButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "+"));
        minusButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "-"));
        multiplyButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() +
                "x"));
        divisionButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() +
                "/"));
        equalButton.setOnClickListener(view -> inputTv.setText(inputTv.getText().toString() + "="));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.calculator_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.info) {
            goToInfoScreen();
        }
        return true;
    }

    private void goToInfoScreen() {
        startActivity(new Intent(this, InfoActivity.class));
    }
}
