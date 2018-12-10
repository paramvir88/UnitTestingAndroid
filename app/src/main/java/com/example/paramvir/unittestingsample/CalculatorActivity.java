package com.example.paramvir.unittestingsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        ButterKnife.bind(this);
    }






}
