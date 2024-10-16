package Linked_List_Examples;

public class Practice {
	Dnode root;

	void create_list() {
		root = null;
	}

	void insert_left(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
			n.right = n;
			n.left = n;
		} else {
			n.right = root;
			n.left = root.left;
			root.left.right = n;
			root.left = n;
		}
		root = n;
		System.out.println(data + " inserted");
	}

	void delete_left() {
		if (root == null) {
			System.out.println("Empty List");
		}
		Dnode t = root;
		if (t.right == root) {
			root = null;
		} else {
			root.left.right = root.right;
			root.right.left = root.left;
			root = root.right;
		}
		System.out.println(t.Data + " deleted");
	}

	void insert_right(int data) {
		Dnode n = new Dnode(data);
		if (root == null) {
			root = n;
			n.right = n;
			n.left = n;
		} else {
			n.left = root.left;
			n.right = root;
			root.left.right = n;
			root.left = n;
		}
		System.out.println(data + " inserted");
	}

	void delete_right() {
		if (root == null) {
			System.out.println("Empty List");
		}
		Dnode t = root.left;
		if (t == root) {
			root = null;
		} else {
			t.left.right = root;
			root.left = t.left;
		}
		System.out.println(t.Data + " deleted");
	}

	void print_list() {
		if (root == null) {
			System.out.println("List Empty");
		}
		Dnode t = root;
		do {
			System.out.print("<-|" + t.Data + "|->");
			t = t.right;
		} while (t != root);
		System.out.println();
	}

	void print_list_rev() {
		if (root == null) {
			System.out.println("List Empty");
		}
		Dnode t = root.left;
		do {
			System.out.print("<-|" + t.Data + "|->");
			t = t.left;
		} while (t != root.left);
		System.out.println();
	}
}
