
public class Student {
	String name; // 이름
	String id; // 학번
	int hank; // 학년
	String dep; // 학과

	public Student(String name, String id, int hank, String dep) {
		this.name = name;
		this.id = id;
		this.hank = hank;
		this.dep = dep;
	}

	public void selfIntroduce() {
		System.out.printf("안녕하세요! 저는 %s학과 %d학년 %s입니다.\n", dep, hank, name);
	}

	public void graduate() {
		if (hank != 4) {
			System.out.printf("%s는 졸업할 수 없다", name);
			return;
		}
		System.out.printf("%s는 졸업을 했다", name);
	}

	public void walk(String place) {
		System.out.printf("%s는 %s로 갔다.", name, place);
	}
}
