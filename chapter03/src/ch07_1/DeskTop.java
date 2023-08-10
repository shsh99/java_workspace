package ch07_1;

public class DeskTop extends Computer {

	// 구현 메서드 오버랑디ㅡ
	@Override
	public void display() {
		System.out.println("화면을 봅니다.");
	}

	@Override
	public void typing() {
		System.out.println("글자를 입력합니다.");
	}

}
