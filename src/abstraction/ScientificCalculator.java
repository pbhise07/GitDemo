package abstraction;

public class ScientificCalculator extends BasicCalculator2 implements IA{

	void m3() {
		System.out.println("hii");
		
	}

	
	public void m2() {
		System.out.println("java");
	
	}


public void m4() {
	
	System.out.println("selenium");
}


public void m5() {
	System.out.println("Java selenium");
}
		
	
public static void main(String[] args) {
	ScientificCalculator obj =new ScientificCalculator();
	obj.m1();
	obj.m2();
	obj.m3();
	obj.m4();
	obj.m5();
}





}
