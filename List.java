package com.ttn.java.Collections;

import java.util.ArrayList;

public class List {
public static void main (String[] arg)
{
    ArrayList<Float> floatnumbers = new ArrayList<Float>();
    float sum = 0.00f;
    floatnumbers.add(1.5f);
    floatnumbers.add(2.5f);
    floatnumbers.add(3.5f);
    floatnumbers.add(4.5f);
    floatnumbers.add(5.5f);

    for (Float floatnumber : floatnumbers)
    {
        sum = sum + floatnumber;
    }
    System.out.println("Result:");
    for (Float floatnumber : floatnumbers)
    {
        System.out.println("Input Value: " + floatnumber);
    }

    System.out.println("Sum of floating-point values: " + sum);
}
}