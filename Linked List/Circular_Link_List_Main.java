package Linked_List_Examples;

import java.util.Scanner;

public class Circular_Link_List_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circular_Linked_List_CLass obj = new Circular_Linked_List_CLass();
		int ch;
		obj.create_List();
		do {
			System.out.println("Link List Menu");
			System.out.println(".....................");
			System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left:\n4.Delete right\n5.Print\n0.Exit :");
			System.out.println(".....................");
			System.out.println("Choice: ");
			ch = sc.nextInt();
			switch (ch) {
			 case 1:
                 System.out.println("Enter element:");
                 int e = sc.nextInt();
                 obj.insert_left(e);
                 System.out.println("Element Inserted");
                 break;

             case 2:
                 System.out.println("Enter element:");
                 e = sc.nextInt();
                 obj.insert_Right(e);
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
             
			case 0:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong option selsected:");
				break;

			}

		} while (ch != 0);
	}

}
