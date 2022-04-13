package com.dit.dsa;
import java.util.Scanner;
public class firstNaturalNumbersEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,n,Sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		  n=sc.nextInt();
		  
			  if (n%2==0)
			  {
			for(i=0;i<=n;i++)
		  {
			  Sum=Sum+i;
		  }
			System.out.println(Sum);
		
			  }
			  else 
					System.out.println("Number is ODD");

			  
			  
	}

	}


