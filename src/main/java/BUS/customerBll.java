package BUS;

import java.util.ArrayList;

import DAO.customerDao;
import DAO.employeeDao;
import DTO.customerDto;
import DTO.employeeDto;

public class customerBll {
	customerDao empDAO = new customerDao();
	public ArrayList<customerDto> getAllCustomer()
	{        return empDAO.getAllCustomer();
	}
	
	public String addCustomer(customerDto emp) {
		if (empDAO.addCustomer(emp))
			return "Thêm thành công customer!\n\n" +
		            "CustomerID: " + emp.getCustomerID() + "\n" +
		            "name: " + emp.getName() + "\n" +
		            "Adress: " + emp.getAddress() + "\n" +
		            "Phone: " + emp.getPhone() + "\n";
		return "Thêm thất bại";  
	}
	
	public String fixCustomer(String id,customerDto emp) {
		if(empDAO.fixCustomer(id, emp))
			return "Sửa thành công customer!\n\n" +
		            "CustomerID: " + emp.getCustomerID() + "\n" +
		            "name: " + emp.getName() + "\n" +
		            "Phone: " + emp.getAddress() + "\n" +
		            "Salary: " + emp.getPhone() + "\n";
		return "Sửa thất bại";  
	}
	
	public String deleteCustomer(String id) {
		if(empDAO.deleteCustomer(id))
			return "Xóa thành công customer"+id;
		return "Xóa thất bại";  
	}
	public ArrayList<customerDto> findAllCustomer(String id,String name){
//		ArrayList<customerDto> emp=new ArrayList<customerDto>();
		return(empDAO.findAllCustomer(id,name));
//		return emp;
		
	}
}
