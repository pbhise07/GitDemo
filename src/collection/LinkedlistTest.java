package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistTest {
public static void main(String[] args) {
	LinkedList<Integer>linkedlist=new LinkedList(); //same as array list except links between nodal points
	linkedlist.add(56);   //faster than arraylist
	linkedlist.add(89);
	linkedlist.add(12);
	linkedlist.add(34);
	linkedlist.add(12);
	linkedlist.add(34);
	System.out.println(linkedlist);
	System.out.println(linkedlist.get(3));
	System.out.println(linkedlist.size());
	linkedlist.remove(2);
	System.out.println(linkedlist);
	linkedlist.add(2, 12);
	System.out.println(linkedlist);
	
	Iterator itr =linkedlist.iterator(); //maintains insertion order using list iteartor
	while(itr.hasNext()) {
		Object obj=itr.next();
		Integer s =(Integer) obj;
		System.out.println(s);
	}
Collections.rotate(linkedlist, 2);// 2 elements rotates after 2 ele. 
System.out.println(linkedlist);
}
}
