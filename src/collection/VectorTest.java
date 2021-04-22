package collection;

import java.util.Vector;

public class VectorTest {
public static void main(String[] args) {
	Vector<Integer> vector=new Vector();//same as array list,it has synchronised methods that is why thread safe & slower than array list 
	System.out.println(vector.capacity());//has capacity concept,default capacity is 10 & it gets doubled when reaches its threshold
	vector.add(56);                   //it is legacy class
	vector.add(89);
	vector.add(12);
	vector.add(34);
	vector.add(12);
	vector.add(34);
	System.out.println(vector);
	System.out.println(vector.size());
	System.out.println(vector.capacity());
}
}
