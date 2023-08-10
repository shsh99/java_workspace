package quiz;

import java.util.Random;

public class DrawingMachineMainTest {

	public static void main(String[] args) {

		Random random = new Random();
		int selected = random.nextInt(4) + 1;

		DrawingMachine[] drawingMachine1 = new DrawingMachine[10];
		drawingMachine1[0] = new Phone("휴대폰");
		drawingMachine1[1] = new Bear("인형");
		drawingMachine1[2] = new Liquor("양주");

		if (drawingMachine1[selected] != null) {
			drawingMachine1[selected].showInfo();
			if (drawingMachine1[selected] instanceof Bear) {
				int price1 = ((Bear) (drawingMachine1[selected])).price;
				String model1 = ((Bear) (drawingMachine1[selected])).model;
				System.out.println("상품명 : " + model1);
				System.out.println("상품가격 : " + price1 + "원");

			} else if (drawingMachine1[selected] instanceof Phone) {
				int price2 = ((Phone) (drawingMachine1[selected])).price;
				String model2 = ((Phone) (drawingMachine1[selected])).model;
				System.out.println("상품명 : " + model2);
				System.out.println("상품가격 : " + price2 + "원");

			} else if (drawingMachine1[selected] instanceof Liquor) {
				int price3 = ((Liquor) (drawingMachine1[selected])).price;
				String model3 = ((Liquor) (drawingMachine1[selected])).model;
				System.out.println("상품명 : " + model3);
				System.out.println("상품가격 : " + price3 + "원");

				  
			} else {
				System.out.println("꽝 입니다.");
			}
		}
		System.out.println();

//		for (int i = 0; i < drawingMachine1.length; i++) {
//			if(drawingMachine1[i] != null) {
//				drawingMachine1[i].showInfo;
//			}
//		}
//		Phone phone1 = (Phone)drawingMachine1;
//		
//		for (DrawingMachine drawingMachine : drawingMachine1) {
//			drawingMachine.drawing();
//			if (drawingMachine instanceof Phone) {
//				Phone iPhone = (Phone)drawingMachine1;
//			}
//		}
	}

}
