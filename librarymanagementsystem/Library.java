package librarymanagementsystem;
import java.util.HashMap;
import entity.*;
public class Library {
	HashMap<String ,Book> books;
	HashMap<String ,Member> members;
	
	public Library()
	{
		books=new HashMap<String ,Book>();
		members=new HashMap<String ,Member>();
		
	}
	
	public void addBook(Book book)
	{
		books.put(book.getTitle(), book);
		System.out.println("Book added Successfully");
		
	}
	public void removeBook(String title)
	{
		books.remove(title);
		System.out.println("Book removed Successfully");
		
	}
	
	public void removeMember(String memberId)
	{
		members.remove(memberId);
		System.out.println("Member removed Successfully");
		
	} 
	
	public Book searchBookbyTitle(String title)
	{
		return books.get(title);
	}
	
	public void displayAllBoooks()
	{
		System.out.println();
		for(Book book:books.values())
		System.out.println(books.ti);
		
	}
	
	public void borrowBooks(String memberId,String book)
	{
		Member member =members.get(memberId);
		Book book=books.get(bookTitle);
		
	}
	
}
