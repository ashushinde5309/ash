package module5;

public class CompareString {

	public static void main(String[] args) {
		int a=100;
		int b=100;
		if(a==b)
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		System.out.println("=======================");
	    String str1="Ashu";
	    String str2="ASHU";
	    if(str1==str2)
	    {
			System.out.println("same");
		}
	    else
		{
			System.out.println("not same");
		}
	    System.out.println("======================");
	    String str3=new String("Ashu");
	    String str4=new String("Ashu");
	    if(str3==str4)
	    {
			System.out.println("same");
		}
	    else
		{
			System.out.println("not same");
		}
	    System.out.println("======================");
	    String str5="Ashu";
	    String str6="Ashu";
	    if(str5.equals(str6))
	    {
			System.out.println("same");
		}
	    else
		{
			System.out.println("not same");
		}
	    if(str1.equalsIgnoreCase(str2))
	    {
			System.out.println("same");
		}
	    else
		{
			System.out.println("not same");
		}
	}

}
