package practice;

public class Instanceclass 
{
	/*
	 * instance class
	 */
	//data members
	public int x;
	public float y;
	public char z;
	public String w;
	public boolean b;
	/*
	 * constructor methods
	 */
	public Instanceclass()
	{
		x=10;
		b=true;
		w="hello";
	}
	//operational methods
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(w);
		System.out.println(b);
	}

}
