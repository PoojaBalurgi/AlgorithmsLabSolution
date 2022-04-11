package com.greatlearning.lab2pb1;

import java.util.Scanner;

public class Lab2Pb1 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n,m;
		System.out.println("Enter the size of transaction array: ");
		n= in.nextInt();
		int ta[]= new int[n];
		
		System.out.println("Enter "+n+" values of array : ");
		for(int i=0;i<n;i++)
			ta[i]=in.nextInt();
		
		System.out.println("Enter the total no of targets that needs to be achieved : ");
		m= in.nextInt();
	
		for(int i=0;i<m;i++)
		{	
			int target=0, sum=0,f=0;
	
			System.out.println("Enter the value of target ");
			target=in.nextInt();
			
			for(int j=0;j<n;j++)
				{
					sum+=ta[j];
					if(sum>=target)
					{
						System.out.println("Target achieved after "+(j+1)+" transactions ");
						f=1;
						break;
					}
				}
			if(f==0)
				System.out.println(" Given target is not achieved ");
		}
		in.close();
	}
}
