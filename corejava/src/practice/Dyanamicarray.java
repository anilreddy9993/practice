package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Dyanamicarray {

	public static void main(String[] args) {
		/*
		 * Declaring dynamic ARRAY list
		 */
		ArrayList<String> x=new ArrayList<String>();
		/*
		 * filling array with scanner
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=Integer.parseInt(sc.nextLine());
		for(int i=0;i<n;i++)
		{
			switch(i+1)
			{
			case 1:
				System.out.println("Enter the 1st word");
				break;
			case 2:
				System.out.println("Enter the 2nd word");
				break;
			case 3:
				System.out.println("Enter the 3rd word");
				break;
				default:
					System.out.println("Enter "+(i+1)+"th word");
			}
			x.add(sc.nextLine());
		}
		/*
		 * sorting
		 */
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(x.get(j).compareTo(x.get(j+1))>0)
				{
					String temp=x.get(j);
					x.set(j, x.get(j+1));
					x.set(j+1, temp);
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.println(x.get(i)+" ");
	}

}
