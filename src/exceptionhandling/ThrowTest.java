package exceptionhandling;

public class ThrowTest {
	public static void main(String[] args) {
		
		try {
			NumberFormatException ex = new NumberFormatException();
			
			throw ex;
		}
		catch(NumberFormatException ex) {
			System.out.println(" explicitely thrown NumberFormatException is collected here ");
			
		}
	}

}
