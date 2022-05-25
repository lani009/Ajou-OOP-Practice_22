package jaxb;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class BookTest {

	public static void main(String[] args) throws JAXBException, IOException {
		BookList list = new BookList();
		list.setListName("fds");
		list.add(new Book(1L, "Book12", "Author1", new Date()));
		list.add(new Book(2L, "Book3", "Author12", new Date()));
		list.add(new Book(3L, "Book6", "Author13", new Date()));

	    JAXB.marshal(list, new File("./book.xml"));
	}
}
