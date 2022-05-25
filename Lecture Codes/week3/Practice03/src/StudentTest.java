
public class StudentTest {

	public static void main(String[] args) {
		Student a = new Student("김국디", "20192222", 3, "국디");
		Student b = new Student("김김김", "2113522", 4, "국디");

		a.selfIntroduce();
		b.selfIntroduce();

		a.graduate();
		b.graduate();

	}

}
