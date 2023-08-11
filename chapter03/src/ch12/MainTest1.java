package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		// 추상 클래스
		// 텔레비전
		// 냉장고

		// 결론
		// 코드를 조금더 유연하고 확장성 있게 설계할 때 표준, 규약, 규칙을 지켜서 설계하고 싶다면
		// 인터페이스를 활용하자.

		// 업 캐스팅된 상태
		HomeAppliances appliances1 = new Television();
		HomeAppliances appliances2 = new Refrigerator();
		// HomeAppliances appliances3 = new ToyRobot();

		RemoteController controller1 = new Television();
		RemoteController controller2 = new Refrigerator();
		RemoteController controller3 = new ToyRobot();

		RemoteController[] remoteControllers = new RemoteController[3];

		remoteControllers[0] = new Television();
		remoteControllers[1] = new Refrigerator();
		remoteControllers[2] = new ToyRobot();
		
		for (int i = 0; i < remoteControllers.length; i++) {
			// RemoteController remoteController = remoteControllers[i];
			remoteControllers[i].turnOn();
			
			remoteControllers[i].turnOff();
			System.out.println("---------------");
		}
	}

}
