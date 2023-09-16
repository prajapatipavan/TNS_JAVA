package salpro;

import java.util.Scanner;

public class Calculator {
	
	
	public static void main(String[] args) {
		
		
		//Calculator calculator = new Calculator();
		
		//calculator.aa=30;
		
		//System.out.println(calculator.aa);
		
		Scanner scanner =new Scanner(System.in);
		
		  Calc aaCalc = new Calc();
		
		  System.out.println("Enter the value No1");
		  aaCalc.no1= scanner.nextInt();
		 System.out.println("Enter the value No2");
		aaCalc.no2= scanner.nextInt();
		 
		System.out.println(aaCalc.toString());
		System.out.println("Addition is " + aaCalc.add());
		System.out.println("Substraction is " + aaCalc.sub());
		System.out.println("Multiplication is " + aaCalc.mult());
		System.out.println("Division is " + aaCalc.div());
		
		
		
	     

	}

}
