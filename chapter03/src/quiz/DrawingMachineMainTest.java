package quiz;

import java.util.Random;

public class DrawingMachineMainTest {

	public static void main(String[] args) {

		Random random = new Random();
		int selected = random.nextInt(3) + 1;

		DrawingMachine[] drawingMachine1 = new DrawingMachine[10];
		drawingMachine1[0] = new Phone("아이폰22");
		drawingMachine1[1] = new Bear("곰인형");
		drawingMachine1[2] = new Liquor("로얄살루트 52년산");
		System.out.println(drawingMachine1[selected]);

		for (int i = 0; i < drawingMachine1.length; i++) {

			if (drawingMachine1[selected] != null) {

				if (drawingMachine1[selected] instanceof Bear) {
					int price1 = ((Bear) (drawingMachine1[selected])).price;
					System.out.println("상품가격 : " + price1);
				} else if (drawingMachine1[selected] instanceof Phone) {
					int price2 = ((Phone) (drawingMachine1[selected])).price;
					System.out.println(DrawingMachine.showInfo);
					System.out.println("상품가격 : " + price2);

				}
			}
		}

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
