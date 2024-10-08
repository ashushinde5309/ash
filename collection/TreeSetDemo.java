package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> tree1=new TreeSet<Integer>();
		tree1.add(10);
		tree1.add(55);
		tree1.add(90);
		tree1.add(85);
		tree1.add(5);
		System.out.println("Size is "+tree1.size());
		tree1.remove(55);
		
		Iterator itr=tree1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		System.out.println("First is "+tree1.first());
		System.out.println("Last is "+tree1.last());
		boolean res = tree1.contains(90);
		System.out.println(res);
		tree1.clear();
		boolean b=tree1.isEmpty();
		System.out.println(b);
	}

}
