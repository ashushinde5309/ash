package module6;

import java.util.*;

public class Customerc {

	public static void main(String[] args) {
		Scanner obj3 = new Scanner(System.in);
		Customer obj = new Customer();
//		System.out.println("Customer Details are..");
//		System.out.println("Customer ID= " + obj.getCustid());
//		System.out.println("Customer ID= " + obj.getName());
//		System.out.println("Customer ID= " + obj.getMobile());
//		System.out.println("Customer ID= " + obj.getAddress());
//		System.out.println("===========================");
		System.out.println(obj);
		System.out.println("Enter Details");
		int custid = obj3.nextInt();
		String name = obj3.next();
		int mobile = obj3.nextInt();
		String addr = obj3.next();
		Customer obj2 = new Customer(custid, name, mobile, addr);
//		System.out.println("Customer Details are..");
//		System.out.println("Customer ID= " + obj2.getCustid());
//		System.out.println("Customer ID= " + obj2.getName());
//		System.out.println("Customer ID= " + obj2.getMobile());
//		System.out.println("Customer ID= " + obj2.getAddress());
//		System.out.println("=============");
		System.out.println(obj2);
//		System.out.println("ENTER NEW NAME");
//		String name2=obj3.next();
//		System.out.println();
	}

}
