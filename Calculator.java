package com.app;

public class Calculator 
{
	void average(int a, int b, int c,int n)
	{
		System.out.println((a+b+c)/n);
	}
	void add(int a, int b, int c)
	{
		System.out.println((a+b+c));
	}
	void sub(int a, int b, int c)
	{
		System.out.println((a-b-c));
	} 
	
	public static void main(String[] args) 
	{
		Calculator cal = new Calculator();
		cal.average(5, 6, 7,3);
		cal.add(8, 5, 2);
		cal.sub(8, 5, 2);
	}
}
