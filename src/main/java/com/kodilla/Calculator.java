package com.kodilla;

public class Calculator {

    public int addAtoB(int a, int b){
        System.out.println(a+b);
        return a+b;
    }
    public int substractBfromA(int a, int b){
        System.out.println(a-b);
        return a-b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.addAtoB(2,3);
        calculator.substractBfromA(6,4);
    }
}
