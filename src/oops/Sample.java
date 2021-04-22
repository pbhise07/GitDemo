package oops;

public class Sample {
 //int num1=100;//instance or global or non static variable
	
static int num2=100;  //static variable

static {                     //static block
	
	System.out.println("This is static block");
}
public void method1() {      //Non static method
	//num1++;
	num2++;
//	System.out.println("num1 in method1 is "+num1);
	System.out.println("num2 in method1 is "+num2);
}
public void method2() {
	//num1++;
	num2++;
//	System.out.println("num1 in method2 is "+num1);
	System.out.println("num2 in method2 is "+num2);
}
public static void method3() {
	num2--;
	System.out.println("num2 in static method3 is "+num2);
}
public static void main(String[] args) {
	
	Sample obj = new Sample();
	
	obj.method1();    //num2 in method1 is 101
	obj.method2();    //num2 in method2 is 102
	 
	Sample obj2 = new Sample();
	
	obj2.method1();   //num2 in method1 is 103
	obj2.method2();   //num2 in method2 is 104
	
	method3();
}
}
