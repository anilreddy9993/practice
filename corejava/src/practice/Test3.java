package practice;

public class Test3
{
/*
 * Data members
 */
	public int input1;
	public int input2;
	/*
	 * constructor method
	 */
	public Test3(int temp1,int temp2)
	{
		input1=temp1;
		input2=temp2;
	}
	/*
	 * operational method
	 */
	public void add1()// with void
	{
		int output=input1+input2;
		System.out.println(output);
	}
	public int add2()//without void
	
	{
		int output=input1+input2;
		return(output);//store output
				}
}
