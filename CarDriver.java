
import java.util.Scanner;


public class CarDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car ();
		System.out.println(car);
	    Car car2 = new Car ("red", 570, 8 );
		System.out.println(car2.toString());
		Car car3 = new Car ("black  ", 200, 4 );
		System.out.println(car3.toString());
		Car car4 = new Car ("white ", 150, 3 );
		System.out.println(car4.toString());
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println(" Please provide the color of the vehicle...");
		String color = keyboard.next();
		car.setColor(color);
		System.out.println(color);


	}

}

