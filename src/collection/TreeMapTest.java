package collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
public static void main(String[] args) {
	TreeMap<Integer, String>tm=new TreeMap();//keys are sorted/ordered in ascending oredr
	tm.put(1, "Pradip");
	tm.put(2, "Virat");
	tm.put(3, "Pradip");
	tm.put(5, "Rohit");
	tm.put(4, "MSD");
	tm.put(1, "Dhoni");
	tm.put(7, null);//null key is not allowed but value is allowed
	
	System.out.println(tm);
	System.out.println(tm.size());
	System.out.println(tm.get(1));
	
	
	 Set s=tm.keySet();
	Iterator itr=s.iterator();
 	while(itr.hasNext()) {
 		Integer key=(Integer)itr.next();
 		System.out.println("Key:"+key);
 		System.out.println("Value:"+tm.get(key));
 	}
}
}
