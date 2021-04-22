package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
public static void main(String[] args) {
	HashSet<Integer>hs=new HashSet();//shuffled/unordered & duplicates are removed
	hs.add(56);
	hs.add(89);
	hs.add(12);
	hs.add(34);
	hs.add(12);
	hs.add(34);
	hs.add(null); //null allowed
	
	System.out.println(hs.size());
	System.out.println(hs);
	
	Iterator itr =hs.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
}
}
