package OOP.assigment.Object;

public class Honda extends Vehicle {
	public void showInfo() {
		System.out.println("thông tin xe" + "\ntên chủ sở hữu: " + getNameVehicle() + "\ntên loại xe: Honda"
				+ "\ndung tích xylanh: " + getCapacity() + "\ngiá trị xe: " + getValue() + "\nthuế: " + getTax());

	}
}
