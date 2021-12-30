package OOP.assigment.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StaffManager {

	private List<Staff> Staffs = new ArrayList<>();
	private int amount;

	// ===Setter getter===//
	public List<Staff> getStaffs() {
		return Staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		Staffs = staffs;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	// ===Methods===//
	public void InputList() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so luong nhan vien");
		amount = sc.nextInt();
		System.out.println("1. Nhap nhan vien phong MKT " + "\n2. Nhap nhan vien phong Admin");
		int number = sc.nextInt();
		do {
			if (number == 1) {
				Marketing mk = new Marketing();
				Staffs.add(mk);
				mk.Print();
				amount --;

			} else if (number == 2) {
				Administration ad = new Administration();
				Staffs.add(ad);
				ad.Print();
				amount --;
			}
		}while(amount !=0);
		
	}

}
