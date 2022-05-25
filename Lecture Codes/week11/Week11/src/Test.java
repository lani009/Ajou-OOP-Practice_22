import java.io.File;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;

public class Test {
	public static void main(String[] args) {
		System.out.println(JAXB.class);
		JAXB.marshal(new Student("hi"), new File("hi.txt"));
	}
}
