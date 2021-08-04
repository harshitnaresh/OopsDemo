package Basics;

import java.util.Scanner;

// Program to display ur name n times & find sum of series

public class ForDemo {

	public static void main(String[] args) {
		int i,n,sum=0;
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter vlue of N:");
		n=s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			System.out.println(i+"- Raj");
		}
		System.out.println("The Sum of Series is:"+sum);
		s.close();

	}

}
