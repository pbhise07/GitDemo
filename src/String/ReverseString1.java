package String;

public class ReverseString1 {
public static void main(String[] args) {
	String s="India is great";
	
	String[] a= s.split(" ");

	int len=a.length;
	for(int i=len-1;i>=0;i--)
	{
		System.out.print(a[i]+" ");
	}
}
}
