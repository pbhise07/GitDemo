package constructor;

public class BasicCalculator {
int num1;
int num2;
public BasicCalculator(int a,int b) { //parameterized constructor
	num1= a;
	num2= b;
	
}
void addition() { 
	int sum = num1+num2;
	System.out.println(sum);
	
}
void sub() {
	int diff =num1-num2;
	System.out.println(diff);
}
public static void main(String[] args) {
	BasicCalculator obj  = new BasicCalculator(100,200);
	obj.addition();
			
	
}
}
