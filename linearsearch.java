package com.dit.dsa;
import java.util.Scanner;
public class linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,n,sum;
		int ar[]= {10,2,6,60};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value to find");  
		   int search= sc.nextInt();  
		   int flag = 0;
		   
		   for(i=0;i<ar.length;i++) {
			   if(ar[i]==search) {
				   System.out.println(ar[i]);
				   flag = 1;
				   break;
			   }
		}
		if (flag == 0) System.out.println("No. is not in the array");
		
	}

}
  