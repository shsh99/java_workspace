package ch01;

public class Hero {
	String name;
	int level;
	int hp;
	int power;

	public Hero() {

	}

	public static void main(String[] args) {
		Warrior war1 = new Warrior();
		Archer arc1 = new Archer();
		Wizzard wiz1 = new Wizzard();
		war1.name = "전사1";
		war1.hp = 500;
		war1.level = 30;
		war1.power = 50;
		war1.skill_1 = "살살패기";
		war1.skill_2 = "보통패기";
		war1.skill_3 = "존나패기";
		System.out.println(war1.name + " 이 스킬을 사용합니다. " + war1.skill_1);
		System.out.println(war1.name + " 이 스킬을 사용합니다. " + war1.skill_2);
		System.out.println(war1.name + " 이 스킬을 사용합니다. " + war1.skill_3);
	}
}

class Warrior extends Hero {
	String skill_1;
	String skill_2;
	String skill_3;

}

class Archer extends Hero {
	String skill_1;
	String skill_2;
	String skill_3;
}

class Wizzard extends Hero {
	String skill_1;
	String skill_2;
	String skill_3;
}