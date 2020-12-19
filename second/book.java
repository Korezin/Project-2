package second;

public class book {
	String author;
	String name;
	int year;
	int pages;
	public String toString() {
		return author + " '" + name + "'" + "\n" + "Год написания: " + year + "\n" + "Количество страниц: " + pages;
	}
}