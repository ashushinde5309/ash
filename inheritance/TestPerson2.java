package inheritance;

public class TestPerson2 {

	public static void main(String[] args) {
		// Creating Array object
		Person[] arr=new Person[5];
		arr[0]=new Person("Ashutosh",26,"Male");
		arr[1]=new Person("Gayatri",26,"Female");
		arr[2]=new Person("Aditya",26,"Male");
		arr[3]=new Person("Girish",26,"Male");
		arr[4]=new Person("Ashvini",26,"Female");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getName()+" is "+arr[i].getAge()+" years old & gender is "+arr[i].getGender());
			
		}
	}

}
