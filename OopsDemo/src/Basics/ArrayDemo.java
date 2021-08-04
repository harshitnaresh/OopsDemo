package Basics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main (String[] args) {
	
		int[] num= {10,20,30,40}; //
		
		System.out.println("The length of Array is:"+num.length);
		System.out.println("The first element in Array:"+num[0]);
		System.out.println("The last element in an array:"+num[num.length-1]);
		System.out.println("The array contents:");


		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter 2nd Array size: ");
		n=s.nextInt();
		
		int num1[]=new int[n];  //declaring array & allocate a memory
		
		System.out.println("Enter Array elements:");
		for(i=0;i<n;i++)
		{
			num[1]=s.nextInt();
		}
		System.out.println("***************2nd Array Contents******");
		for(int j=0;j<num1.length;j++)
		{
			System.out.println(num[j]+" ");
		}
	}

}
