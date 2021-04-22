package returntype;

public class A {

	int a=10;
	int b =20;
	public int addition()
	{
		int sum;
		sum = a+b;
		return sum;
		
	}
	public static void main(String[] args) {
		A a=new A();
		int total= a.addition();
		System.out.println(Math.sin(total)); //s.o.p.(Math.sin(a.addition))
		
	}
}
