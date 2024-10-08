package collection;

import java.util.HashMap;

public class HashMapDeamo {

	public static void main(String[] args) {
		HashMap<Character,String> hashmap=new HashMap<Character,String>();
		hashmap.put('A', "One");
		hashmap.put('B', "Two");
		hashmap.put('C', "Three");
		hashmap.put('D', "Four");
		hashmap.put('E', "Five");
		hashmap.put('F', "Six");
		hashmap.put('G', "Seven");
		hashmap.put('H', "Eight");
		
		System.out.println(hashmap);
		
		boolean res=hashmap.containsKey('D');
		System.out.println(res);
		
		hashmap.remove('E');
		hashmap.replace('H', "Eight", "Nine");
		System.out.println(hashmap);
		
		System.out.println("==============================");
		System.out.println("Displaying Keys");
		Object keys[]=hashmap.keySet().toArray();
		System.out.println("\nKeys= ");
		for(int i=0;i<keys.length;i++)
		{
			System.out.print(keys[i]+" ");
			System.out.print(hashmap.get(keys[i]));
			System.out.println();
			
		}
		
		System.out.println("===========================");
		System.out.println("Go to one value");
		System.out.println(hashmap.get('G'));

	}

}
