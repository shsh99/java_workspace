package ch04;

public class MainTest1 {

	public static void main(String[] args) {
		
		// 자동차를 클래스 메모리에 올려 보자
		
		Engin engin1 = new Engin("V8", 2_000);
		Engin engin2 = new Engin("V6", 1_000);
		
		Car car1 = new Car("벤츠",8_000 , engin2);
		car1.getEngin().getName();
		// int enginPrice = car1.engin.price;
	
		
	}

}
