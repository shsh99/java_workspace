package quiz;

public class Phone extends DrawingMachine {

	int price;
	String model;
	
	public Phone(String name) {
		super(name);
		price = 4_000_000;
		model = "갤럭시 Z플립 5";
	}

}
