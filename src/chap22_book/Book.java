package chap22_book;

public class Book implements Comparable<Book>{
	String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	
	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

	@Override
	public int compareTo(Book one) {
		return  this.title.compareTo(one.getTitle());
	}
}



