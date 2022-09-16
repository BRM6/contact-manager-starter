package com.programming.techie;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class Main {

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(TestSuit.class);
        System.out.println(result.getRunCount());
    }
}
