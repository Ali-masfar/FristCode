package cars.train;


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MotorOfCars motor = new MotorOfCars();
		 motor.make = "BMW 55555";
		 motor.color = "RED";
		System.out.println("Calling showAtts...");
		motor.showAtts();
		System.out.println("*********");
		System.out.println("Starting Engine...");
		motor.startEngine();
		System.out.println("*********");
		System.out.println("Calling ShowAtts...");
		motor.showAtts();
		System.out.println("*********");
		System.out.println("Starting Engine...");
		motor.startEngine();
		
	}

}
class MotorOfCars{
	

	String make;
	String color;
	boolean engineState;

	void startEngine() {
	if (engineState == true)
	System.out.println("The engine is already on.");
	else {
	engineState = true;
	System.out.println("The engine is now on.");
	}
	}
	   
public	 void showAtts() {
	System.out.println("This MotorCars is a "
	 + color + " " + make);
	if (engineState == true)
	 System.out.println("The engine is on.");
	 else System.out.println("The engine is off.");
	}
private	 void showAttPrivate() {
	System.out.println("This MotorCars is a "
	 + color + " " + make);
	if (engineState == true)
	 System.out.println("The engine is on.");
	 else System.out.println("The engine is off.");
	}

}




