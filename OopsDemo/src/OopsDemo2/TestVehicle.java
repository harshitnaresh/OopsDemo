package OopsDemo2;

//Dynamic Pllymorphism
public class TestVehicle {

	public static void main(String[] args) {
		
		Vehicle vObj=new Vehicle();
		vObj.drive();
		
		Vehicle vCar=new Car1(); //Upcasting
		vCar.drive();
		
		Vehicle vTruck= new Truck();  //Upcasting
		vTruck.drive();
	//	vTruck.load();  // compile time error
		
		Truck t1=new Truck();
		t1.load();
		
	}

}
