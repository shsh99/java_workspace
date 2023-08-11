package ch13;

import java.util.List;

public class MainTest1 {

	public static void main(String[] args) {

//		List list;

		// 자바에서 상속은 단일 상속만을 지원
		// 단, Object 클래스는 제외

		Book book1 = new Book(1, "홍길동전", "허균");
		Book book2 = new Book(2, "흐르는강물처럼", "파울로코엘료");
		Book book3 = new Book(2, "흐르는강물처럼", "파울로코엘료");

		if (book1 == book2) {
			System.out.println("물리적으로 같다");
		} else {
			System.out.println("물리적으로 다르다");
		}

		System.out.println("-------------------");

		if (book1.equals(book2)) {
			System.out.println("같은 책입니다.");
		} else {
			System.out.println("다른 책입니다.");
		}

	}

}
