package stringclass;

public class StringBufferDemo {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Ashu");
		sb.append("Shinde");
		System.out.println(sb);
		int a=sb.indexOf("s");
		System.out.println(a);
		int b=sb.lastIndexOf("e");
		System.out.println("b is "+b);
		sb.replace(7, 8,"Ash");
		System.out.println(sb);
		sb.delete(2, 9);
		System.out.println(sb);
		System.out.println(sb.reverse());
		
				

	}

}
