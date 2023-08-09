package ch05;

public class Banana extends Fruit {
	
	String origin;

	public Banana(String name, int price) {
		super(name, price); // 부모 생성자 호출해줘야 함
		origin = "필리핀";
	}

}
