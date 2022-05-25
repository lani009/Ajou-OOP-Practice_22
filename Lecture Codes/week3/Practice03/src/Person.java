public class Person {
	private String name;
	private int age;
	private int height;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			// 될 수 없다
		}

	}

	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("Height는 음수가 될 수 없다.");
		}
	}

	public int getHeight() {
		if (height == 0) {
			System.out.println("Height 초기화 안됨");
		}
		return this.height;
	}

	public void selfIntroduce() {
		System.out.printf("안녕하세요! 저는 %s입니다. 나이는 %d이고 키는 %dcm입니다.", name, age, height);
	}
}
