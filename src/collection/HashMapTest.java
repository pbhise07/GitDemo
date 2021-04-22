package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {
public static void main(String[] args) {
	HashMap<Integer, String>hm=new HashMap();//keys are unique,if key is duplicate then it takes latest key value pair
	hm.put(1, "Pradip");      //sorted i.e.doesn't maintain insertion order
	hm.put(2, "Virat");
	hm.put(6, "RAhul");
	hm.put(3, "Pradip");
	hm.put(5, "Rohit");
	hm.put(4, "MSD");
	hm.put(1, "Dhoni");
	hm.put(null, null); //null key-value allowed
	System.out.println(hm);
	System.out.println(hm.size());
	System.out.println(hm.get(1));
	
	Set s=hm.keySet();
	Iterator itr=s.iterator();
	while(itr.hasNext()) {
		Integer key=(Integer)itr.next();
		System.out.println("Key:"+key);
		System.out.println("Value:"+hm.get(key));
	}
	
}
}
