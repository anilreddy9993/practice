package practice;

public class Test5 {

	public static void main(String[] args) {
		Polymorphism poly=new Polymorphism(2, 3);
		int x=poly.add();
		int y=poly.add(4);
		int z=poly.add(6, 9);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

	}

}
