package com.example.paramvir.unittestingsample;

/**
 * Handles calcualtor operations.
 */
public class Calculator {

    private int leftOperand = -1;
    private int rightOperand = -1;
    private String operator;


    public int addTwoValues(int a, int b) {

        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public void onNewValueInput(int value){
        if(rightOperand == -1){
            if(operator == null){
                if(leftOperand == -1){
                    assignLeftOperand(value);
                }else{
                    addValueToLeftOperand(value);
                }
            }else{
                assignRightOperand(value);
            }
        }else{
            addValueToRightOperand(value);
        }
    }

    public void onNewOperatorInput(String operator){

    }

    public void assignLeftOperand(int value){
        leftOperand = value;
    }
    public void assignRightOperand(int value){
        rightOperand = value;
    }

    public void addValueToLeftOperand(int value){
        leftOperand = leftOperand * 10 + value;
    }

    public void addValueToRightOperand(int value){
        rightOperand = rightOperand * 10 + value;
    }

    public int getLeftOperand() {

        return leftOperand;
    }

    public int getRightOperand(){
        return rightOperand;
    }

    public String getOperator(){
        return operator;
    }
    public void assignOperator(String op){
        operator = op;
    }
}
