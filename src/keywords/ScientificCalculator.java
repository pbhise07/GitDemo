package keywords;

public class ScientificCalculator extends BasicCalculator {    //Inheritance

	void calculatesinevalue() {
		double sinvalue=Math.sin(num1);
		System.out.println(sinvalue);
		
}
	void calculatecosvalue() {;
		
		double cosvalue=Math.cos(num1);
		System.out.println(num1);
		
	}
	public static void main(String[] args) {
		
		ScientificCalculator obj=new ScientificCalculator();
		obj.num1=60;
		obj.num2=45;
		
		obj.addition();
		obj.sub();
		obj.calculatesinevalue();
		obj.calculatecosvalue();
	}
	
}
