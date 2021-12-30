package OOP.assigment.Object;

import java.util.List;
import java.util.Scanner;



public class Marketing extends Staff {
	private double sales;
	private double commission;
	
	
	
	
	public double getSales() {
		return sales;
	}

	public void setSales(double inputSales) {
		this.sales = Checksales(inputSales);
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double Inputcommission) {
		this.commission = Checkcommission(Inputcommission);
	}

	// ===CONSTRUCTOR==//

	public Marketing() {
		super();
		Scanner sc = new Scanner(System.in);
		System.out.println("Moi nhap doanh thu");
		sales = sc.nextDouble();
		System.out.println("Moi nhap phu cap");
		commission = sc.nextDouble();
		
	}

	public double Checksales(double inputSales) {
		while (inputSales > 0) {
			this.sales = inputSales;
			return inputSales;
		}
		return 0;
	}

	@Override
	public double Calsalary() {
		return this.basicSalary * this.factorSalary;
	}



	public double Checkcommission(double InputSales) {
		if (InputSales > 5 && InputSales < 10) {
			commission = 0.05 * InputSales;
		} else if (InputSales > 10 && InputSales < 20) {
			commission = 0.2 * InputSales;
		}else {
			commission = 0;
		}
		return commission;
	}
	
	

}
