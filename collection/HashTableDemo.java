package collection;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable<Integer , String> hashtable=new Hashtable<Integer,String>();
		hashtable.put(01,"Ashutosh");
		hashtable.put(02,"Jayesh");
		hashtable.put(03,"Aditya");
		hashtable.put(04,"Mahavir");
		hashtable.put(05,"Siddhesh");
		hashtable.put(06,"Yash");
		
		System.out.println(hashtable);
		
		System.out.println(hashtable.get(02));
		System.out.println(hashtable.get(04));
		System.out.println(hashtable.get(03));

	}

}
