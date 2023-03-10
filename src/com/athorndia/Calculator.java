package com.athorndia;

public class Calculator {

	public Calculator() {

	}

	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public double divide(double num1, double num2) {
		if (num2 == 0) {
			return 0;
		}
		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(1, 2));
		System.out.println(calc.subtract(3, 4));
		System.out.println(calc.multiply(5, 6));
		System.out.println(calc.divide(7, 8));
	}

}