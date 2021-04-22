package controlStatement;

public class Starpattern {
	
		public static void main(String[] args) {
			int i;
			
			

		for( i=1;i<=5;i++)// line
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			
		System.out.println();
		}
	}
}

