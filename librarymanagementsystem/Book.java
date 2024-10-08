package librarymanagementsystem;

public class Book {

	String title;
	String auther;
	String Category;
	boolean availability;

	public Book(String title, String auther, String category, boolean availability) 
	{
		super();
		this.title = title;
		this.auther = auther;
		Category = category;
		this.availability = true;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public boolean isAvailable()
	{
		return availability;
	}
	
	
	
}
