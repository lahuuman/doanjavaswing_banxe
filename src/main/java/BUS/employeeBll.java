package BUS;
import DAO.employeeDao;
import DTO.employeeDto;
import java.util.ArrayList;
import java.util.Iterator;
public class employeeBll {
	employeeDao empDAO = new employeeDao();
	public ArrayList<employeeDto> getAllEmployees()
	{        return empDAO.getAllEmployees();
	}
	
	public String addEmployee(employeeDto emp) {
		if (empDAO.addEmployee(emp))
			return "Thêm thành công employee!\n\n" +
		            "EmployeeID: " + emp.getEmployeeID() + "\n" +
		            "name: " + emp.getName() + "\n" +
		            "DOB: " + emp.getDOB() + "\n" +
		            "salary: " + emp.getSalary() + "\n";
		return "Thêm thất bại";  
	}
	
	public String fixEmployee(String id,employeeDto emp) {
		if(empDAO.fixEmployee(id, emp))
			return "Sửa thành công employee!\n\n" +
		            "EmployeeID: " + emp.getEmployeeID() + "\n" +
		            "name: " + emp.getName() + "\n" +
		            "DOB: " + emp.getDOB() + "\n" +
		            "salary: " + emp.getSalary() + "\n";
		return "Sửa thất bại";  
	}
	
	public String deleteEmployee(String id) {
		if(empDAO.deleteEmployee(id))
			return "Xóa thành công employee"+id;
		return "Xóa thất bại";  
	}
	public ArrayList<employeeDto> findAllEmployee(String id,String name){
		ArrayList<employeeDto> emp=new ArrayList<employeeDto>();
		emp=empDAO.findAllEmployee(id,name);
		return emp;
		
	}
	}

