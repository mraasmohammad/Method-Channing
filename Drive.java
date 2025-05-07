public class Drive {
	public static void main(String[] args) {
	Vehicle.Start();
	Car.Start();
	ElectricCar.Start();
	Vehicle v1=new Car();
	Vehicle v2=new ElectricCar();
	v1.Start();
	v1.drive();
	v2.Start();
	v2.drive();
	}
}
