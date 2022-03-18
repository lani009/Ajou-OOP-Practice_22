
public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon triangle = new RegularPolygon(3);
		RegularPolygon square = new RegularPolygon(4);

		System.out.println("삼각형 내각의 합: " + triangle.getSumOfInternalAngles());
		System.out.println("삼각형 내각: " + triangle.getInternalAngle());
		System.out.println("삼각형 외각: " + triangle.getExteriorAngle());
		System.out.println();
		System.out.println("사각형 내각의 합: " + square.getSumOfInternalAngles());
		System.out.println("사각형 내각: " + square.getInternalAngle());
		System.out.println("사각형 외각: " + square.getExteriorAngle());
	}

}
