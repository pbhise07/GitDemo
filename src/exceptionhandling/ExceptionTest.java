package exceptionhandling;

public class ExceptionTest {

	public static void main(String[] args) {
		try{
			int num =100/0;
			System.out.println(num);
		}
		catch(Exception e) {
			e.printStackTrace();
		
	}
	finally {
		System.out.println("hello");
	}
}
}
