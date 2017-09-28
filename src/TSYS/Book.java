package TSYS;

public class Book {
final String author;
final String bookName;


public Book(String author, String bookName) {
	super();
	this.author = author;
	this.bookName = bookName;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((bookName == null) ? 0 : bookName.hashCode());
	return result;
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bookName == null) {
		if (other.bookName != null)
			return false;
	} else if (!bookName.equals(other.bookName))
		return false;
	return true;
}




}
