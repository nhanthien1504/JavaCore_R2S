package OOP.assigment.Object;

import java.util.List;

public class Administration extends Staff{
	private double allowance;
	
	

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	
	public double Checkallowance(double Inputallowance) {
		while (Inputallowance > 0) {
			this.allowance = Inputallowance;
			return Inputallowance;
		}
		return 0;
	}
	
	
}
