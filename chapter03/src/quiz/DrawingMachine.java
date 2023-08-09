package quiz;

public class DrawingMachine {

	public static final char[] showInfo = null;
	String name;
	int price;

	public DrawingMachine(String name) {
		this.name = name;
		
	}
	
	public void drawing() {
		System.out.println("뽑기 기계를 사용합니다.");
	}

	public void showInfo() {
		System.out.println("상품명 : " + name);
		
	}
}
