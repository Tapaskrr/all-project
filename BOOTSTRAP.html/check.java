

import java.util.Scanner;

public class check {

	static void display(Car car) {
		System.out.println(car.brake());
		System.out.println(car.accelaration());
		System.out.println(car.gear());
		System.out.println("ddd");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
//
//		String carName = scanner.next();
//
		
		
		int i=scanner.nextInt();
		Run.display(new Audi());

		System.out.println("ddd");

	}

}
