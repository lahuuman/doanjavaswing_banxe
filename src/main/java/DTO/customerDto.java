package DTO;

public class customerDto {
	public String customerID;
	public String name;
	public String address;
	public String phone;
	@Override
	public String toString() {
		return "customerDto [customerID=" + customerID + ", name=" + name + ", address=" + address + ", phone=" + phone
				+ "]";
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public customerDto(String customerID, String name, String address, String phone) {
		super();
		this.customerID = customerID;
		this.name = name;
		this.address = address;
		this.phone = phone;
	}
	public customerDto() {
		
	};
}
