package com.class12;

//источник: https://youtu.be/O-69kG6-wxw
public class Class12_float {

    public static int summ (int a, int b) {
        return (a + b);
    }

    public static int summ (int a, int b, int g) {
        return (a + b + g);
    }

    public static float summ (float a, float b, float g) {
        return (a + b + g);
    }

    public static void main(String[] args) {
        System.out.println(summ(23, 12));
        System.out.println(summ(23, 12, 15));
        System.out.println(summ(23.23f, 12.12f, 15.1f));
    }
}
