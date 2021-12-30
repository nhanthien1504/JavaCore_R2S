package OOP.assigment.Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
	private String accountName;
	private String pin;
	private double accountBalance;

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {

		this.accountName = accountName;
	}

	public void setPin(String pinInput) {

		this.pin = checkChar(pinInput);

	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	// ==CONSTRUCTOR========//

	public Account(String accountName, String pin, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public Account(String accountName, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountBalance = accountBalance;

	}

	public Account() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten account");
		accountName = sc.nextLine();
		System.out.println("Nhap mã pin");
		pin = sc.nextLine();
		System.out.println("Nhap so tien trong tai khoan");
		accountBalance = sc.nextDouble();

	}

	// ==METHODS===//

	public String checkChar(String pinInput) {

		for (int i = 0; i < pinInput.length(); i++) {
			boolean flag = Character.isDigit(pinInput.charAt(i));
			if (flag) {

			} 
			else 
			{

			}
		}

		try {

			while (pinInput.length() < 8) {
				Scanner sc = new Scanner(System.in);
				pinInput = sc.nextLine();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return pinInput;
	}

	public double Withdrawal() {
		double withdrawalAmount;
		Scanner sc = new Scanner(System.in);
		System.out.println("nhập số tiển rút");
		withdrawalAmount = sc.nextDouble();
		if (accountBalance < withdrawalAmount) {
			double remainingAmount = accountBalance - withdrawalAmount;
			return withdrawalAmount;
		}
		System.out.println("so tien trong tai khoan khong du");
		return 0.0;
	}

	public void Transfer(Account accountName2, double accountBalance2) {

		accountBalance -= accountBalance2;
		accountName2.accountBalance += accountBalance2;

		if (Withdrawal() != 0) {
			System.out.println("Chuyen tien thanh cong!!!");

		} else {
			System.out.println("chuyển tiền thất bại!!");
		}

	}
}
