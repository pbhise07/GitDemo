package collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
public static void main(String[] args) {
	LinkedHashSet<Integer>linkedhs=new LinkedHashSet();//maintains insertion order & duplicates are removed 
	linkedhs.add(56);
	linkedhs.add(89);
	linkedhs.add(12);
	linkedhs.add(34);
	linkedhs.add(12);
	linkedhs.add(34);
	linkedhs.add(null);//null allowed
	System.out.println(linkedhs);
	System.out.println(linkedhs.size());
	Iterator itr =linkedhs.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	}
}
