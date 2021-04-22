package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
public static void main(String[] args) {
	TreeSet<Integer>ts=new TreeSet();//sorted & duplicates are removed
	ts.add(56);
	ts.add(89);
	ts.add(12);
	ts.add(34);
	ts.add(12);
	ts.add(34);
//	ts.add(null); null value is not allowed
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.last());
	Iterator itr =ts.iterator();
	while(itr.hasNext())
		System.out.println(itr.next());
	
}
}
