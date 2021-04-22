package String;import javax.print.attribute.standard.Chromaticity;

public class DigitsFromString {
public static void main(String[] args) {
	String str="Java123Selenium";
	
	char[]ch=str.toCharArray();
	
	int sum;
	for(int i=0;i<ch.length;i++)
	{
		if(Character.isDigit(ch[i]));
		{
			 sum=Character.getNumericValue(ch[i]);
		}
		System.out.println(sum);
	}
}
}
