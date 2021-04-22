package polymorphism;

public class B extends A {
int k;
int l;
	public void addition(int l)
	{
		int sum = l;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		
		B b = new B();
		b.addition();
		b.addition(20, 23);
		b.addition(58);
	}
	
	
	
	
	
	
}
