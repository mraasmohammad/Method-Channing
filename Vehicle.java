public class Vehicle {
	public static void Start()
	{
		System.out.println("Start Vehicle");
	}
	public void drive()
	{
		System.out.println("Drive Vehicle");
	}

}
	class ElectricCar extends Vehicle {
	public static void Start() 
	{
		System.out.println("Start ElectricCar");
	}
	public void drive()
	{
		System.out.println("Drive ElectricCar");
	}
	
}
    class Car extends Vehicle {
	public static void Start() 
	{
		System.out.println("Start Car");
	}
	public void drive()
	{
		System.out.println("Drive Car");
	}
	
}
