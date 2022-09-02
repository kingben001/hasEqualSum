package com.company;

public class Main {

    public static void main(String[] args) {

        boolean test= hasEqualSum(1,-1,0);
        System.out.println(test);
    }

    public static boolean hasEqualSum(int one, int two, int three) {

        if (one + two == three) {
        return true;
        }

        return false;
    }
}
