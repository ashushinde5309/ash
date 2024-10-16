package Linked_List_Examples;

public class Circular_Linked_List_CLass {
	Node root;
	Node last;

	void create_List() {
		root = last = null;
	}

	void insert_left(int data) {
		Node n = new Node(data);
		if (root == null) {
			last = root = n;
			last.next = root;
		} else {
			n.next = root;
			root = n;
			last.next = root;

		}
		System.out.println(data + " inserted");
	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty list");
		} else {
			Node t;
			t = root;
			if (root == last) {
				last = root = null;
			} else {
				root = root.next;
				last.next = root;
			}
			System.out.println(t.data + " deleted");

			System.out.println(t.data + " inserted");
		}
	}

	void insert_Right(int data) {
		Node n = new Node(data);
		if (root == null) {
			last = root = n;
			last.next = root;
		} else {
			last.next = n;
			last = n;
			last.next = root;

		}
		System.out.println(data + " inserted");
	}

	void delete_right() {
		if (root == null)
			System.out.println("Empty List");
		else {

			Node t, t2;
			t = t2 = root;// 1
			if (root == last) {
				last = root = null;
			} else {
				while (t != last) {
					t2 = t;
					t = t.next;
				}

				last = t2;
				last.next = root;
			}
			System.out.println(t.data + " deleted");
		}
	}

	void print_list() {
		if (root == null)
			System.out.println("List Empty");
		else {
			Node t = root;
			do{
				System.out.print("|" + t.data + "|->");
				t = t.next;
			}while(t!=root);
		}
	}
}
