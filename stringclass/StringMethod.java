package stringclass;

public class StringMethod {

	public static void main(String[] args) {
		String str=new String("  Ashutosh S Shinde");
		String str2=new String("   Shinde");
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,8));
		System.out.println(str.trim());
		System.out.println(str.indexOf("s"));
		System.out.println(str.replace("s","ss"));
		System.out.println(str.concat(str2));
		if(str.equals(str2))
		{
			System.out.println("Same");
		}
		String[]arr=str.split(" ");
		for(String s:arr)
		{
			System.out.println(s);
		}

	}

}
