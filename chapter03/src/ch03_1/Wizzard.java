package ch03_1;

public class Wizzard extends Hero {

	public Wizzard(String name, int hp) {
		super(name, hp);

	}

	public void freezing() {
		System.out.println("마법사가 얼음 공격을 합니다.");
	}

	@Override
	protected void attack() {
		System.out.println(name + " 기본 공격을 합니다.");
	}
}
