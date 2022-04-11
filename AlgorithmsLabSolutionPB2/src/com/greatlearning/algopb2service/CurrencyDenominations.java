package com.greatlearning.algopb2service;

import java.util.Arrays;
import java.util.Scanner;

public class CurrencyDenominations {
	Scanner sc=new Scanner(System.in);
	int value[],size,i,amount,valuecount[],flag;
	
	public void input()
	{
		System.out.println("Enter the size of currency denominations : ");
		size=sc.nextInt();
		
		value=new int[size];
		System.out.println("Enter "+size+" currency denominations value : ");
		for(i=0;i<size;i++) 
		{
			value[i]=sc.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay : ");
		amount=sc.nextInt();
	}
	
	public void denominations() 
	{
		int f=0,ramount = 0,j=0;

		//sort();
		
		valuecount=new int[size];
		ramount=amount;
		for(i=0;i<size;i++)
		{
			ramount=amount;
			Arrays.fill(valuecount, 0);
			for(j=i;j<size;j++)
			{
				valuecount[j]=ramount/value[j];
				ramount=ramount-(valuecount[j]*value[j]);
				if(ramount==0)
				{
					f=1;
					break;
				}
			}
			if(f==1)
				break;
		}
		if(ramount!=0)
		{
			Arrays.fill(valuecount, 0);
			flag=1;
			System.out.println("Can not be paid");
		}
	}
	
	public void output()
	{
		if(flag!=1)
			{
				System.out.println("Your payment approach in order to give min no of notes will be : ");
				for(i=0;i<size;i++)
				{
					if(valuecount[i]!=0)
						System.out.println(value[i]+" : "+valuecount[i]);
				}
			}
	}	
}
