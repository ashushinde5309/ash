package stringclass;

public class StringBuilderDemo {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		sb.insert(5,"ashu");
		System.out.println(sb);
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
