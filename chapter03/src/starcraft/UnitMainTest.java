package starcraft;

import java.util.Scanner;

public class UnitMainTest {

	public static void main(String[] args) {

//		int ZEALOT = 1;
//		int MARINE = 2;
//		int ZERGLING = 3;
//		int GAME_END = 4;

		Zealot zealot1 = new Zealot("질럿");
		Marine marine1 = new Marine("마린");
		Zergling zergling1 = new Zergling("저글링");
//		Scanner sc = new Scanner(System.in);
//		zealot1.attack(marine1);
//		marine1.attack(zealot1);
//		zergling1.attack(zealot1);
//		
//		zealot1.showInfo();
		
		Unit[] arrayUnit = new Unit[10];
		arrayUnit[0] = zealot1;
		arrayUnit[1] = marine1;
		arrayUnit[2] = zergling1;
		
		zealot1.showInfo();
		marine1.showInfo();
		zergling1.showInfo();
		zealot1.attack(marine1);
		marine1.attack(zealot1);
		zergling1.attack(marine1);
//
//		
//		System.out.println("캐릭터를 생성하세요.");
//		System.out.println("1.질럿, 2.마린, 3.저글링, 4.게임종료");
//		int input = sc.nextInt();
//		
//	
//		while (input == 1) {
//		
//			zealot1 = new Zealot(sc.nextLine());
//			System.out.println("질럿을 생성합니다.");
//			System.out.println("닉네임을 입력하세요 :");
//			zealot1.name = sc.nextLine();
//			System.out.println("공격력을 입력하세요: ");
//			zealot1.power = sc.nextInt();
//			System.out.println("체력을 입력하세요: ");
//			zealot1.hp = sc.nextInt();
//			zealot1.showInfo();
//
//			if (input == 2) {
//				marine1 = new Marine(sc.nextLine());
//				System.out.println("마린을 생성합니다.");
//				System.out.println("닉네임을 입력하세요 :");
//				marine1.name = sc.nextLine();
//				System.out.println("공격력을 입력하세요: ");
//				marine1.power = sc.nextInt();
//				System.out.println("체력을 입력하세요: ");
//				marine1.hp = sc.nextInt();
//				marine1.showInfo();
//			} else if (input == 3) {
//				zergling1 = new Zergling(sc.nextLine());
//				System.out.println("저글링을 생성합니다.");
//				System.out.println("닉네임을 입력하세요 :");
//				zergling1.name = sc.nextLine();
//				System.out.println("공격력을 입력하세요: ");
//				zergling1.power = sc.nextInt();
//				System.out.println("체력을 입력하세요: ");
//				zergling1.hp = sc.nextInt();
//				zergling1.showInfo();
//			} else {
//				break;
//			}
//			System.out.println("게임을 종료합니다.");
//		} ;
//
//		int unitChoice = -1;
//
//		// do while 활용하기
//		do {
//			System.out.println("생성한 유닛을 선택 하세요");
//			System.out.println("1.질럿 2.마린 3.저글링 4.종료");
//			unitChoice = sc.nextInt();
//
//			if (unitChoice == ZEALOT) {
//				System.out.println("질럿을 선택하셨습니다.");
//				zealot1.showInfo();
//				System.out.println("------------------");
//				System.out.println("공격할 유닛을 선택하세요");
//				System.out.println("2.마린 3.저글링");
//				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
//				System.out.println("------------------");
//				int num1 = sc.nextInt();
//				if (num1 == GAME_END) {
//					System.out.println("게임을 종료합니다.");
//					break;
//				}
//				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
//				int num2 = sc.nextInt();
//				if (num1 == MARINE) {
//					for (int i = 0; i < num2; i++) {
//						zealot1.attack(marine1);
//					}
//					marine1.showInfo();
//				} else if (num1 == ZERGLING) {
//					for (int i = 0; i < num2; i++) {
//						zealot1.attack(zergling1);
//						zergling1.showInfo();
//					}
//				}
//			} else if (unitChoice == MARINE) {
//				System.out.println("마린을 선택하셨습니다.");
//				marine1.showInfo();
//
//				System.out.println("------------------");
//				System.out.println("공격할 유닛을 선택하세요");
//				System.out.println("1.질럿 3.저글링");
//				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
//				System.out.println("------------------");
//				int num1 = sc.nextInt();
//
//				if (num1 == GAME_END) {
//					System.out.println("게임을 종료합니다.");
//					break;
//				}
//				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
//				int num2 = sc.nextInt();
//				if (num1 == ZEALOT) {
//					for (int i = 0; i < num2; i++) {
//						marine1.attack(zealot1);
//						zealot1.showInfo();
//					}
//				} else if (num1 == ZERGLING) {
//					for (int i = 0; i < num2; i++) {
//						marine1.attack(zergling1);
//						zergling1.showInfo();
//					}
//				}
//
//			} else if (unitChoice == ZERGLING) {
//				System.out.println("저글링을 선택하셨습니다.");
//				zergling1.showInfo();
//
//				System.out.println("------------------");
//				System.out.println("공격할 유닛을 선택하세요");
//				System.out.println("1.질럿 2.마린");
//				System.out.println("게임을 종료하고싶으시면 4.를 입력해주세요");
//				System.out.println("------------------");
//				int num1 = sc.nextInt();
//				if (num1 == GAME_END) {
//					System.out.println("게임을 종료합니다.");
//					break;
//				}
//				System.out.println("몇 회 공격할지 숫자를 입력해주세요");
//				int num2 = sc.nextInt();
//				if (num1 == ZEALOT) {
//					for (int i = 0; i < num2; i++) {
//						zergling1.attack(zealot1);
//						zealot1.showInfo();
//					}
//				} else if (num1 == MARINE) {
//					for (int j = 0; j < num1; j++) {
//						zergling1.attack(marine1);
//						marine1.showInfo();
//					}
//				}
//			}
//
//		} while (unitChoice == GAME_END);
//		System.out.println("게임을 종료합니다.");
//		System.out.println("------------------");
	}

}
