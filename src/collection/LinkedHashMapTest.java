package collection;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {
public static void main(String[] args) {
	LinkedHashMap<Integer, String>linkedhm=new LinkedHashMap();//keys are in same order as we insert i.e.maintains insertion order
	linkedhm.put(1,"Pradip");  
	linkedhm.put(2, "Virat");
	linkedhm.put(3, "Pradip");
	linkedhm.put(5, "Rohit");
	linkedhm.put(4, "MSD");
	linkedhm.put(1, "Dhoni");
	linkedhm.put(null, null); //null key-value allowed
     System.out.println(linkedhm);
     System.out.println(linkedhm.size());
     System.out.println(linkedhm.get(1));
     Set s=linkedhm.keySet();
 	Iterator itr=s.iterator();
 	while(itr.hasNext()) {
 		Integer key=(Integer)itr.next();
 		System.out.println("Key:"+key);
 		System.out.println("Value:"+linkedhm.get(key));
 	}
 	
}
}
