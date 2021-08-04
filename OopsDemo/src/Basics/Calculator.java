package Basics;

import java.util.Scanner;

/* Program to perform Arithmatic Operations & demonstrate use of 
 * * Scanner Class for Input
 * */
 */
public class Calculator {

	public static void main(String[] args) {

		int num1,num2,sum,sub,mul;  //declatations
		float div;
		String user;
		Scanner s=new Scanner(System.in);
		
		//input
		System.out.println("******** Calculator *******");
		System.out.println("Enter User Name:");
		user=s.next(); //string input
		System.out.println("Enter 2 numbers:");
		num1=s.nextInt(); //integer input
		num2=s.nextInt();
		
		//process
		sum=num1+num2;
		sub=num1-num2;
		mul=num1*num2;
		div=(float)num1/num2; //type casting
		
		//output
		System.out.println("User :"+user);
		System.out.println("The Addition of 2 nos is:"+sum);
		System.out.println("The Substration of 2 nos is:"+sub);
		System.out.println("The Multiplication of 2 nos is:"+mul);
		System.out.println("The Division of 2 nos is:"+div);
	}

}
