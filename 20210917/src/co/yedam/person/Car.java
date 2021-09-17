package co.yedam.person;

public class Car {
	
	//필드
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	private Tire tire;
	
	
	//생성자
	public Car(String carName, String carModel, int carPrice, String ttire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	
	
	//메소드
	public Car(String carName, String carModel, int carPrice, String ttire, int maxSpeed, co.yedam.person.Tire tire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		Ttire = ttire;
		this.maxSpeed = maxSpeed;
		Tire = tire;
	}
}
