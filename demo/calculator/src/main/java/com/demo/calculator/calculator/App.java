package com.demo.calculator.calculator;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner input=new Scanner(System.in);
    	System.out.println("**************Airthmetic Operations****************");
    	System.out.println("Enter Value1:=>");
    	 int value1=input.nextInt();
    	 System.out.println("Enter Value2:=>");
    	 int value2=input.nextInt();
    	System.out.println("Enter OPERATOR:=>");
    	String opr=input.next();
    	System.out.println("solution=>"+performCalculation(value1,value2,opr));
    	}
    	private static int performCalculation(int value1, int value2, String opr) {
	    	CalculatorFace cf= (v1,v2,op)->{
		    	if("+".equals(op))
		    	return v1+v2;
		    	else if("-".equals(op))
		    	return v1-v2;
		    	else if("*".equals(op))
		    	return v1*v2;
		    	else if("/".equals(op))
		    	return v1/v2;
		    	else if("%".equals(op))
		    	return v1%v2;
		    	else
		    	return 000;
	    	};
	    	return cf.calculate(value1, value2, opr); 
    }
}
