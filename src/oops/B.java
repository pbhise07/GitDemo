package oops;

public class B extends A {
	
	void print() {
		
	System.out.println("I am in B");
		
		
	}

	public static void main(String[] args) {
		
		A a = new A(); //I am in A
		a.print();
		
		B b = new B(); //I am in B
		b.print();
		
		A c =new B();  //I am in B   // means we can call child class member by parent class by
		//making constructor of child class but reverse not possible(compile time error)
		
		c.print();
	
		
	}
}
