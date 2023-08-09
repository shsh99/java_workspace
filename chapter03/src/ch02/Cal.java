package ch02;

public class Cal {

	// 속성...

	// 기능

	public Cal() {
		System.out.println("cal() 생성자 호출 - 부모");
	}

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}

} // end of class

// 객체 지향 패러다임 핵심
// 객체와 객체간의 상호작용 또 관계를 형성해 나가는 것.
class Cal2 extends Cal {

	public Cal2() {
		System.out.println("cal2() 생성자 호출 - 자식");
	}

	public int minus(int n1, int n2) {
		return n1 - n2;
	}

	// 상속에서는 메서드의 재정의가 가능하다.

	// 주석 + 힌트
	@Override // 어노테이션 이라고 부름
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 입력 하였습니다.");
		}
		return n1 * n2;
	}
	// 위와 같은 기법을 오바라이드 라고 부름.
	
	// 오버 라이드 != 오버로딩 : 다른 개념
	// 생성자 오버로딩 -> 메서드 오버로딩
	
	// 생성자 오버로딩 -> 메서드 오버로딩
	public int minus(int n1, int n2, int n3) {
		return n1 - (n2 - n3);
	}
}
