package librarymanagementsystem;

import java.util.ArrayList;

public class Member {

	String name;
	String memberid;
	ArrayList<Book> borrowedBooks;
	static long id = 1000;

	public Member(String name, String memberid, ArrayList<Book> borrowedBooks) {
		super();
		this.name = name;
		this.memberid = "LIB"+ ++id;
		this.borrowedBooks = new ArrayList<Book>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemberid() {
		return memberid;
	}

	public ArrayList<Book> getBorrowedBooks() {
		return borrowedBooks;
	}

	public static long getId() {
		return id;
	}
	
	public void borrowedBook(Book book)
	{
		if(book.isAvailable())
		{
			borrowedBooks.add(book);
			book.setAvailability(false);
			System.out.println(this.name+" Borrowed Book "+book.getTitle());
		}
		else
		{
			System.out.println("This Book is not Available");
			
		}
	}
	
	public void removeBook(Book book)
	{
		if(borrowedBooks.contains(book))
		{
			borrowedBooks.remove(book);
			book.setAvailability(true);
			System.out.println(this.name+" Returned Book "+book.getTitle());
		}
		else
		{
			System.out.println("This Book is Available");
			
		}
	}
	
}
