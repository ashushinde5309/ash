package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
//		ArrayList arrayList=new ArrayList();//1
//		ArrayList<Emp> arrayList=new ArrayList<Emp>();//2
		List arrayList=new ArrayList();//3
		Emp obj=new Emp(01, "Ashutosh", 100000);
		Emp obj2=new Emp(02, "Gayatri", 100000);
		Emp obj3=new Emp(03, "Aditya", 100000);
		Emp obj4=new Emp(04, "Girish", 100000);
		Emp obj5=new Emp(05, "Ashwini", 100000);
		
		arrayList.add(obj);
		arrayList.add(obj2);
		arrayList.add(obj3);
		arrayList.add(obj4);
		arrayList.add(obj5);
		arrayList.add(10);
		arrayList.add("AS");
		for(int i=0;i<arrayList.size();i++)
		{
			System.out.println(arrayList.get(i));
			System.out.println("=================================");
		}
		
		
		
		
		System.out.println("Using Iterator Method");
		Iterator itr=arrayList.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println("=================================");
		}
		
		
		int a=arrayList.size();
		System.out.println(a);
		
		int res=arrayList.indexOf("AS");
		System.out.println(res);
		
		int res2=(int) arrayList.set(5, 90);
		System.out.println(res2);
		
			
				
				
				
		
	}

}
