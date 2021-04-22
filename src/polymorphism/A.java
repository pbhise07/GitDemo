package polymorphism;

public class A {
int a=10;
int b= 30;
public void addition()
{
	int sum =a+b;
	System.out.println(sum);
}
public void addition(int i,int j)
{
	int sum =i+j;
	System.out.println(sum);
}
public static void main(String[] args) {
	A a =new A();
	a.addition();
	a.addition(45, 65);
	
}
}
