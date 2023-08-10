package quiz;

public class DrawingMachine {

	String name;
	

	public DrawingMachine(String name) {
		this.name = name;

	}

	public void drawing() {
		System.out.println("뽑기 기계를 사용합니다.");
	}

	public void showInfo() {
		System.out.println("상품종류 : " + name);

	}
}
