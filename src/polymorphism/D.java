package polymorphism;

public class D extends C {
	//public D() {
	//	super.print();
	//}
	public void print ()
	{
		System.out.println("Method in D");
	}
public static void main(String[] args) {
	D d =new D();
	d.print();
	C c = new D();
	c.print(); //Method in D
	C cc =new C();
	cc.print();//method in C
}
}
