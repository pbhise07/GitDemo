package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListTest {
	public static void main(String[] args) {
		
		ArrayList <Integer> al= new ArrayList();//duplicates are allowed & maintains insertion order but slower than other arrays
		al.add(56);
		al.add(89);
		al.add(12);
		al.add(34);
		al.add(12);
		al.add(34);
		System.out.println(al);
		System.out.println(al.size());
		al.remove(2);
		System.out.println(al);
		al.add(2, 12);
		System.out.println(al);
		
		
		
		Iterator itr =al.iterator(); //maintains insertion oredr using list iterator
		while(itr.hasNext()) {
			Object obj=itr.next();
			Integer s =(Integer) obj;
			System.out.println(s);
		}
		
		Collections.sort(al);//collections is a class & sort is method
		System.out.println(al);//gives sorted element
		Collections.reverse(al);//gives reverse order
		System.out.println(al);
	}

}
