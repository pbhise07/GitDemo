package abstraction;

public class A implements IA,IB{

	@Override
	public void m4() {
	System.out.println("abc");
		
	}

	@Override
	public void m5() {
		System.out.println("xyz");
		
	}
public static void main(String[] args) {
	A obj = new A();
	obj.m4();
	obj.m5();
	obj.m6();
	obj.m7();
}

@Override
public void m6() {
	System.out.println("pqr");
	
}

@Override
public void m7() {
	System.out.println("ijk");
	
}
	
}
