package OOP.assigment.Object;

import java.util.Scanner;

import Implement.Fuel;

public class Vehicle implements Fuel {
	private String nameVehicle;
	private String model;
	private int capacity;
	private double value;
	private double tax;

	// === SETTER GETTER=====///
	public String getNameVehicle() {
		return nameVehicle;
	}

	public void setNameVehicle(String nameVehicle) {
		if (nameVehicle == "") {
			System.out.println("không biết");
		} else {
			this.nameVehicle = nameVehicle;
		}
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		if (capacity < 0) {
			System.out.println(0);
		} else {
			this.capacity = capacity;

		}
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		if (value < 0) {
			System.out.println(0);
		} else {
			this.value = value;
		}
	}

	public double getTax() {
		double cons;
		if (capacity < 100) {
			cons = 0.01;
		} else if (capacity > 100 && capacity < 200) {
			cons = 0.03;
		} else {
			cons = 0.05;
		}
		return getValue() * cons;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public Vehicle(String nameVehicle, String model, int capacity, double value) {
		super();
		this.nameVehicle = nameVehicle;
		this.model = model;
		this.capacity = capacity;
		this.value = value;

	}

	public Vehicle() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Mời nhập thông tin xe");
		System.out.print("Tên chủ xe: ");
		nameVehicle = sc.nextLine();
		System.out.print("Tên loại xe: ");
		model = sc.nextLine();
		System.out.print("Dung tích xylanh:  ");
		capacity = sc.nextInt();
		System.out.print("Giá trị xe:  ");
		value = sc.nextDouble();

	}

	public void showInfo() {
		System.out.println("thông tin xe" + "\ntên chủ sở hữu: " + getNameVehicle() + "\ntên loại xe: " + getModel()
				+ "\ndung tích xylanh:  " + getCapacity() + " cc" + "\ngiá trị xe: " + getValue()  +"VNĐ"+ "\nthuế: " + getTax());
	}
}
