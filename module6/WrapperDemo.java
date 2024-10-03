package module6;

public class WrapperDemo 
{

	public static void main(String[] args) 
	{
		String str1="100";
		String str2="200";
		String str3="300.253";
		String str4="521.235";
		System.out.println("Total "+(Integer.parseInt(str1)+Integer.parseInt(str2)));
		System.out.println("============================");
		System.out.println("Total is "+(Double.parseDouble(str3)+Double.parseDouble(str4)));
		System.out.println("Total is "+(Float.parseFloat(str3)+Float.parseFloat(str4)));
		System.out.println("==================");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Byte.MAX_VALUE);
	}

}
