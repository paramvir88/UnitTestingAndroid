package com.example.paramvir.unittestingsample;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import android.widget.TextView;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.fakes.RoboMenuItem;

import butterknife.BindView;
import butterknife.ButterKnife;

import static org.junit.Assert.assertEquals;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class CalculatorActivityTest {

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

    MenuItem infoMenu;
    Activity activity;


    @Before
    public void setup() {
        activity = Robolectric.setupActivity(CalculatorActivity.class);
        ButterKnife.bind(this, activity);
        infoMenu = new RoboMenuItem(R.id.info);
    }

    @Test
    public void testButtonOneFunctionality() {
        String input = inputTv.getText().toString();
        oneButton.performClick();
        assertEquals(input + "1", inputTv.getText().toString());
    }

    @Test
    public void testButtonTwoFunctionality() {
        String input = inputTv.getText().toString();
        twoButton.performClick();
        assertEquals(input + "2", inputTv.getText().toString());
    }

    @Test
    public void testButtonThreeFunctionality() {
        String input = inputTv.getText().toString();
        threeButton.performClick();
        assertEquals(input + "3", inputTv.getText().toString());
    }

    @Test
    public void testButtonFourFunctionality() {
        String input = inputTv.getText().toString();
        fourButton.performClick();
        assertEquals(input + "4", inputTv.getText().toString());
    }

    @Test
    public void testButtonFiveFunctionality() {
        String input = inputTv.getText().toString();
        fiveButton.performClick();
        assertEquals(input + "5", inputTv.getText().toString());
    }

    @Test
    public void testButtonSixFunctionality() {
        String input = inputTv.getText().toString();
        sixButton.performClick();
        assertEquals(input + "6", inputTv.getText().toString());
    }

    @Test
    public void testButtonSevenFunctionality() {
        String input = inputTv.getText().toString();
        sevenButton.performClick();
        assertEquals(input + "7", inputTv.getText().toString());
    }

    @Test
    public void testButtonEightFunctionality() {
        String input = inputTv.getText().toString();
        eightButton.performClick();
        assertEquals(input + "8", inputTv.getText().toString());
    }

    @Test
    public void testButtonNineFunctionality() {
        String input = inputTv.getText().toString();
        nineButton.performClick();
        assertEquals(input + "9", inputTv.getText().toString());
    }

    @Test
    public void testButtonZeroFunctionality() {
        String input = inputTv.getText().toString();
        zeroButton.performClick();
        assertEquals(input + "0", inputTv.getText().toString());
    }

    @Test
    public void testButtonPlusFunctionality() {
        String input = inputTv.getText().toString();
        plusButton.performClick();
        assertEquals(input + "+", inputTv.getText().toString());
    }

    @Test
    public void testButtonMinusFunctionality() {
        String input = inputTv.getText().toString();
        minusButton.performClick();
        assertEquals(input + "-", inputTv.getText().toString());
    }

    @Test
    public void testButtonMultiplyFunctionality() {
        String input = inputTv.getText().toString();
        multiplyButton.performClick();
        assertEquals(input + "x", inputTv.getText().toString());
    }

    @Test
    public void testButtonDivideFunctionality() {
        String input = inputTv.getText().toString();
        divisionButton.performClick();
        assertEquals(input + "/", inputTv.getText().toString());
    }

    @Test
    public void testButtonEqualFunctionality() {
        String input = inputTv.getText().toString();
        equalButton.performClick();
        assertEquals(input + "=", inputTv.getText().toString());
    }

    @Test
    public void clickingInfoMenu_shouldGoToInfoActivity(){
        activity.onOptionsItemSelected(infoMenu);
        Intent expectedIntent = new Intent(activity, InfoActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }




   /* @Test
    public void testButtonDelFunctionality() {
        String input = inputTv.getText().toString();
        zeroButton.performClick();
        Assert.assertEquals(input + "0", inputTv.getText().toString());
    }
    */





    /*@Test
    public void inputBoxShouldAllowSpecificCharactersOnly() {


    }

    @Test
    public void testResultShouldShowValidResult() {

    }

    @Test
    public void testResultBoxShouldShowAllowedCharactersOnly() {

    }

    @Test
    public void testResultBoxShouldShowCorrectCalculationFromInputBox() {

    }

    @Test
    public void testResultShouldBeClearWhenActivityIsLoaded() {

    }

    @Test
    public void testResultShouldClearWhenDeleteLongPressed() {

    }

    @Test
    public void testInputShouldBeScrollableWhenLongInput() {

    }*/

}
