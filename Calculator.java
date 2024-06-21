package com.app;

public class Calculator 
{
	void average(int a, int b, int c,int n)
	{
		System.out.println((a+b+c)/n);
	}
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		cal.average(5, 6, 7,3);
	}
}
