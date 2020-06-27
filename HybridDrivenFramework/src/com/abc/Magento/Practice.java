package com.abc.Magento;

import java.math.BigInteger;
import java.util.Scanner;

public class Practice {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		
		int n=sc.nextInt();
		BigInteger fact=BigInteger.ONE;
		if(n<0)
		{
			System.out.println("no factorial for negative numbers");
		}
		else if(n==0)
		{
			System.out.println("the factorial is 1");
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fact);
		}
		
		
		
		sc.close();
	}

}
