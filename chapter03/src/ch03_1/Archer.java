package ch03_1;

public class Archer extends Hero {

	public Archer(String name, int hp) {
		super(name, hp);

	}

	public void fireArrow() {
		System.out.println("궁수가 불화살 공격을 합니다.");
	}

	@Override
	protected void attack() {
		System.out.println(name + " 이 기본 공격을 합니다.");
	}
}
