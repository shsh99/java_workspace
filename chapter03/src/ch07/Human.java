package ch07;

// 추상 메서더를 상속 받았다면
// 해결방법
// 1. 자식 클래스도 추상 클래스로 만들어 주면 된다.
// 2. 추상 메서드를 일반(구현) 메서드로 재정의 해주면 된다.
public class Human extends Animal {

	@Override
	public void hunt() {
		System.out.println("돌 도끼로 사냥을 합니다.");
	}

}
