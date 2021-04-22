package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {
	public static void main(String[] args) {
		
	
	try {
	FileReader reader = new FileReader("F://sample.text");
		
		
	}
    catch(FileNotFoundException e){
    	
	e.printStackTrace();
	
	}
}
}