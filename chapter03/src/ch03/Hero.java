package ch03;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}
	
	protected void attack() {
		System.out.println("기본 공격을 합니다.");
	}
}
