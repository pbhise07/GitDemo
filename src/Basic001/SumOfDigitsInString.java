package Basic001;

public class SumOfDigitsInString {
public static void main(String[] args) {
	String str ="Java123Selenium";
	char [] ch = str.toCharArray();
	int sum = 0;
	for(int i =0;i<ch.length;i++)
	{
		if(Character.isDigit(ch[i]))
		{
	sum = sum + Character.getNumericValue(ch[i]);
	
	    }
	
      }
	System.out.println(sum); 
}
}
