package Linked_List_Examples;

import java.util.Scanner;

public class Practice_Main {

	public static void main(String[] args) {
		Practice obj = new Practice();
		Scanner in = new Scanner(System.in);
		int ch, e;

		obj.create_list();
		do {
			System.out.println(
					"\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print\n6.Print Reverse\n0.Exit :");
			ch = in.nextInt();
			switch (ch) 
			{
			case 1:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_left(e);
				System.out.println("Element Inserted");
				break;

			case 2:
				System.out.println("Enter element:");
				e = in.nextInt();
				obj.insert_right(e);
				System.out.println("Element Inserted");
				break;

			case 3:
				obj.delete_left();
				break;

			case 4:
				obj.delete_right();
				break;

			case 5:
				obj.print_list();
				break;

			case 6:
				obj.print_list_rev();
				break;

			case 0:
				System.out.println("Exiting....");
				break;

			default:
				System.out.println("Wrong option selected");
				break;
			}

		} while (ch!= 0);

	}

}
