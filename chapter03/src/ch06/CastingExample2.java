package ch06;

public class CastingExample2 {

	public static void main(String[] args) {
		
		// 다형성, 업캐스팅
		// 업 캐스팅은 하위 클래스의 객체를 상위 클래스 타입으로 변환하는 것
		// 이 경우에는 데이터 손실이 없다.
		// 업 캐스팅은 자동적으로 이루어짐으로 별도의 형 변환 연산자가 필요없다.
		Animal animal = new Bird(); // 업캐스팅.
		
		// 다운 캐스팅
		// 다운 캐스팅은 업캐스팅 된 객체를 다시 원래의 하위 클래스 타입으로 변환하는 것
		// 다운 캐스팅은 수동적으로 형 변환 연산자를 사용해야 함. 
		// 업캐스팅 된 객체를 하위 클래스의 메서드, 속성을 사용하기 위해 필요
		Bird bird = (Bird)animal; // 다운캐스팅
		bird.fly();
		
		
		// 배열을 활용
		Animal[] animals = new Animal[3];
		animals[0] = new Animal();
		animals[1] = new Bird();
		animals[2] = new Animal();
		
		System.out.println("====================");
		
		// 0 -- Animal -> if = false
		// 1 -- Bird -> if = true
		// 2 -- Animal -> if = false
		for (Animal a : animals) {
			a.makeSound();
			// a.fly(); 데이터 타입 확을하려면 instanceof 연산자 활용
			if(a instanceof Bird) {
				Bird targetBird = (Bird)animal;
				targetBird.fly();
			}
			System.out.println("--------------");
			
		}
		
//		for (int i = 0; i < animals.length; i++) {
//			
//		}
		
	
		
	}

}
