package ru.volkov.lesson3.wrapper;

public class BoxingNumbersDemo {
    public static void main(String[] args) {
//        Double number = 8.0;
        Double number = Double.valueOf("8.0"); //This is boxing of double by Double class
        number += 5.0;                           //This is unboxing Double to double

        System.out.println("number = " + number);

        boolean r = true;
        Boolean r1 = Boolean.FALSE;
    }
}