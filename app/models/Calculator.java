package models;

public class Calculator
{
	int num1;
	int num2;

	public int getNum1()
	{
		
		return num1;
	}
	public int getNum2()
	{
		
		return num2;
	}	
	public Calculator()
	{
		
	}
	public Calculator(int x,int y)
	{
		num1=x;
		num2=y;
		
	}
	
	public static int sum(Calculator c)
	{
		
		//return 10;
		return c.num1+c.num2;
		
	}

}
