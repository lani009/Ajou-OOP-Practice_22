package jaxb;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXB;

public class UnMarshalTest {
	public static void main(String[] args) {
		BookList list =  JAXB.unmarshal(new File("./book.xml"), BookList.class);
		
		for (Book book : list.getBookList()) {
			System.out.println(book.getName());
		}
	}
}
