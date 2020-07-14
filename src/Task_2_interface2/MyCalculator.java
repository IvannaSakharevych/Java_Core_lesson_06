package Task_2_interface2;

import Task_2_interface1.Numerable;

public class MyCalculator implements Numerable{

	@Override
	public void plus() {
		System.out.println("This is method PLUS");
		
	}

	@Override
	public void minus() {
		System.out.println("This is method MINUS");
		
	}

	@Override
	public void multiply() {
		System.out.println("This is method MULTIPLY");
		
	}

	@Override
	public void devide() {
		System.out.println("This is method DEVIDE");
		
	}

	
	public static void main(String[] args) {
		MyCalculator MyCalculator = new MyCalculator();
		MyCalculator.plus();
		MyCalculator.minus();
		MyCalculator.multiply();
		MyCalculator.devide();
		
	}
	
	
}



