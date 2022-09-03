package com.tech;

import java.lang.Math;


public class App
{
   public double sqr(float a)
    {
	return Math.sqrt(a);
    }
    public static void main( String[] args )
    {
        System.out.println("Square root of 36 is : "+ new App().sqr(36));
    }
}
