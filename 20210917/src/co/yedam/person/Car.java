package co.yedam.person;

public class Car {
	
	//�ʵ�
	private String carName;
	private String carModel;
	private int carPrice;
	private int maxSpeed;
	private Tire tire;
	
	
	//������
	public Car(String carName, String carModel, int carPrice, String ttire) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.maxSpeed = maxSpeed;
		this.tire = tire;
	}
	
	
	//�޼ҵ�
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
