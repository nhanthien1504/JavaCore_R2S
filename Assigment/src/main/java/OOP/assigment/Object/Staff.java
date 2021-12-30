package OOP.assigment.Object;

import java.util.Scanner;

public class Staff {

	private int code;
	private String name;
	protected double basicSalary;
	private double seniority;
	protected double factorSalary;
	private double currenSalary;

	// ==GETTER SETTER==//
	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setSeniority(double Inputseniority) {
		this.seniority = Checkseniority(seniority);
	}

	public double getFactorSalary() {
		return factorSalary;
	}

	public void setFactorSalary(double factorSalary) {
		this.factorSalary = factorSalary;
	}

	public void setCurrenSalary(double currenSalary) {
		this.currenSalary = currenSalary;
	}

	public double getCurrenSalary() {
		
		return currenSalary;
	}

	// ==CONSTRUCTOR==//
	public Staff(int code, String name, double basicSalary, int seniority, double factorSalary, double currenSalary) {
		super();
		this.code = code;
		this.name = name;
		this.basicSalary = basicSalary;
		this.seniority = seniority;
		this.factorSalary = factorSalary;
	}

	public Staff() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so thu tu nhan vien: ");
		code = sc.nextInt();
		sc = new Scanner(System.in);
		System.out.println("nhap ten nhan vien: ");
		name = sc.nextLine();
		System.out.println("nhap ten luong co ban: ");
		basicSalary = sc.nextInt();
		System.out.println("nhap tham nien: ");
		seniority = sc.nextDouble();
		System.out.println("nhap he so luong: ");
		factorSalary = sc.nextDouble();

	}

	// ==METHODS==//
	public double Calsalary() {
		return this.basicSalary * this.factorSalary;
	}

	public void Print() {
		System.out.println("Ten nhan vien:" + name + "\nluong: " + Calsalary());
	}

	public double Checkseniority(double Inputseniority) {
		while (Inputseniority > 0) {
			this.seniority = Inputseniority;
			return this.seniority;
		}
		return 0;
	}

}
