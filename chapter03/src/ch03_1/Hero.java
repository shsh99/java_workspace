package ch03_1;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	// 접근 제어 지시자 protected
	// = 상속받는 자식 클래스들은 접근 가능
	protected void attack() {
		System.out.println("기본 공격을 시작합니다.");
	}

}
