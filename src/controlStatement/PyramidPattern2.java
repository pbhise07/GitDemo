package controlStatement;

public class PyramidPattern2 {
	public static void main(String[] args) {
		char c = 'A',x='A';
		int a =1;
		
		for(int i=1;i<=5;i++)
		{

			for(int j =5;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			if(i%2==0)
			{
	      ;
		
			}
			else
			{
			c =x++	;
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" "+c);
			}
			
			System.out.println();
		}
	
}
}