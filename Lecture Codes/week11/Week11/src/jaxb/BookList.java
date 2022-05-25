package jaxb;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;

public class BookList {
	private String listName;
	@XmlElement(name="book")
	private List<Book> bookList = new ArrayList<>();
	
	public void add(Book book) {
		bookList.add(book);
	}
	
	public String getListName() {
		return listName;
	}

	public void setListName(String listName) {
		this.listName = listName;
	}

	public List<Book> getBookList() {
		return bookList;
	}
}
