package practice;

import java.util.Scanner;

public class Quicksort {

	public static void main(String[] args) 
	{
		int x[]=new int[5];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<5;i++) 
		{
			System.out.println("Enter a"+(i+1)+" number");
			x[i]=sc.nextInt(); 
		}
		/*
		 * sorting starts in looping
		 */
		for(int i=0;i<5;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(x[j]>x[j+1])
				{
					int temp=x[j];
					x[j]=x[j+1];
					x[j+1]=temp;
				}
			}
		}

		for(int i=0;i<5;i++)
		{
			System.out.println(x[i]+" ");
		}

	}

}
