package collection;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableTest {
public static void main(String[] args) {
	Hashtable<Integer, String>ht=new Hashtable();//null key & null values are not allowed
	ht.put(1, "Pradip"); //it has synchronised methods
	ht.put(2, "Virat");  //doesn't maintain insertion order
	ht.put(3, "Pradip");  //sorted in descending order
	ht.put(4, "MSD");
	ht.put(1, "Dhoni");
	ht.put(5, "Rahul");
	ht.put(12, "Chahal");
	ht.put(6, "Rohit");
	ht.put(7, "Shikhar");
	ht.put(8, "Pandya");
	ht.put(9, "Bumrah");
	ht.put(10, "Shami");
	ht.put(11, "Virat");
	System.out.println(ht);
	System.out.println(ht.size());
	System.out.println(ht.get(1));
	
	Set s=ht.keySet();
	Iterator itr=s.iterator();
 	while(itr.hasNext()) {
 		Integer key=(Integer)itr.next();
 		System.out.println("Key:"+key);
 		System.out.println("Value:"+ht.get(key));
}
}
}