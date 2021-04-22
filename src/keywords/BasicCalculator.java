package keywords;

public class BasicCalculator {
int num1;
int num2;

	

void addition() { 
	int sum = num1+num2;
	System.out.println(sum);
	
}
void sub() {
	int diff =num1-num2;
	System.out.println(diff);
}
public static void main(String[] args) {
	BasicCalculator obj  = new BasicCalculator();
	obj.addition();
			
	
}
}
