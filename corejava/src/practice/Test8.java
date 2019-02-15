package practice;

public class Test8 {
	/*
	 * loop in loop
	 */

	public static void main(String[] args) {
	

		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}

		
	}

}
