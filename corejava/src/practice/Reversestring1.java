package practice;



import java.util.Scanner;


public class Reversestring1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String x=sc.nextLine();
		String y=" ";
		for (int i=x.length()-1;i>=0;--i)
		{
			char z=x.charAt(i);
			y=y+z;
		}
		System.out.println(y);

	}

}
