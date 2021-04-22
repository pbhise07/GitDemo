package exceptionhandling;

public class ThrowsTest {

	 
	 void m1() throws NullPointerException {  //Runtime exception or unchecked excetion
		
	 }
	 void m2() {
		 m1();   
		 
		System.out.println("Runtime exception or unchecked excetion");
	 }
	 
	 void m3() throws ClassNotFoundException{   //Compiletime or checked excetion
		
	 }
	 void m4() throws ClassNotFoundException {
		
		m3(); 
		System.out.println("Compiletime or checked excetion");
	 }
	 public static void main(String[] args) throws ClassNotFoundException {
		 ThrowsTest throwstest=new ThrowsTest();
		 throwstest.m2();// As m2() throws runtime/unchecked exception above,so here also not necessary to handle, it will handle automatically
		 throwstest.m4();//As m4() throws compiletime/checked exception above,so here it also throws compiletime/checked exception
		
	}
	
		
	}


