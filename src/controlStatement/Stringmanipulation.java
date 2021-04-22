package controlStatement;

public class Stringmanipulation {
public static void main(String[] args) {

	String name ="java program";
	String name1 ="java prograM";
	String name2 ="java";
	name =name.replace(" ", "_");
	System.out.println(name);
	if(name.equals(name1))
	{
	System.out.println("name and name1 are equal");
	}
	else
		System.out.println("not equal");
	if(name.equalsIgnoreCase(name))
	{
		System.out.println("NAME AND NAME1 ARE EQUAL");
	}
	System.out.println(name2.toUpperCase());
	
}
}
