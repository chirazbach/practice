package asd.service.impl;

import asd.service.Calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a+b;
    }

    @Override
    public int substraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }

    @Override
    public  int divison(int a, int b) throws Exception {
        if(b== 0){
            throw new Exception ("Devider can t be zero");
        }
        return a/b;
    }

    public boolean equalIntegers(int a,int b){
        boolean result=false;
        if(a==b){
            result= true;
        }
        return result;
    }
}
