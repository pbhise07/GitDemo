package AccessModifiers;

public class BasicCalculator {
int num1=5;
int num2=2;
public void addition() { 
	int sum = num1+num2;
	System.out.println(sum);
	
}
private void addition1() { //can't be accessed outside the class
	int sum = num1+num2;
	System.out.println(sum);
	
}




public void sub() {
	int diff =num1-num2;
	System.out.println(diff);
	
}

protected void sub1() {   //can be accessed within same package & outside the package if inheritance present
	int diff =num1-num2;
	System.out.println(diff);
}
   void sub2() {   //can't be accessed outside the package
	int diff =num1-num2;
	System.out.println(diff);
}
}