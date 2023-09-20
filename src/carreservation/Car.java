package carreservation;

public class Car {
	String color;
	String brand;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}

	public static void main(String[] args){
	System.out.println("yeah");	
	}
	public Car(String color, String brand) {
		super();
		this.color = color;
		this.brand = brand;
	}
	
}
