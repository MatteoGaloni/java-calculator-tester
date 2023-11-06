package model;

import exceptions.DividendIsZeroException;

public interface Calculator {
//    ***ATTRIBUTES***

//    ***CONSTRUCTORS**

//    ***METHODS***
    public static float add(float num1, float num2){
        return num1 + num2;
    }
    public static float subtract(float num1, float num2){
        return num1 - num2;
    }
    public static float divide(float num1, float num2) throws DividendIsZeroException{
        if (num2 == 0){
            throw new DividendIsZeroException();
        }
        return num1 / num2;
    }
    public static float multiply(float num1, float num2){
        return num1 * num2;
    }


}


