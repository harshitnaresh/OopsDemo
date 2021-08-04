package Basics;

// Program to Count Vowels in a string

public class CountVowels {

	public static void main(String[] args) {
		
		String s="java is fun";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
			{
				count+=1;
				System.out.println("Vowel Found: "+s.charAt(i));
			}
		}
		System.out.println("Total no. of vowels in string:"+count);
	}

}
