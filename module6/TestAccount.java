package module6;

public class TestAccount {

	public static void main(String[] args) {
		Account cust=new Account();
		cust.setAccNo(1234);
		cust.setAccName("AShu");
		cust.setAccBal(1000000);
		System.out.println(cust);
		
		
		Account cust2=new Account(2533,"Ashu",10000000);
		System.out.println(cust2);

	}

}
