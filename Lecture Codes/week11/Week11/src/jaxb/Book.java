package jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "id", "name", "date" })
public class Book {
	private Long id;
	private String name;
	private String author;
	private Date date;
	
	public Book() {
		
	}

	public Book(Long id, String name, String author, Date date) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.date = date;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@XmlElement(name = "title")
	public void setName(String name) {
		this.name = name;
	}

	@XmlTransient
	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
}