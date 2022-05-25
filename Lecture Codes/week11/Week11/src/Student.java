import javax.xml.bind.annotation.XmlElement;

public class Student {
	@XmlElement(name="name")
	String name;

	public Student(String name) {
		super();
		this.name = name;
	}
	
}
