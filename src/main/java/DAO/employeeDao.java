package DAO;
import DTO.employeeDto;
import java.sql.*;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class employeeDao {
	private Connection con;
	public boolean openConnection() 
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String dbUrl = "jdbc:mysql://localhost:3306/doanbanxe";
		String username = "root"; 
		String password= "minhman1";
		con= DriverManager.getConnection(dbUrl, username, password);
		return true;
	}catch(Exception e) {
		System.out.println(e);
		return false;
	}
	}
	public void closeConnection() {
		try {
			if (con!=null)
				con.close();
		}catch (SQLException ex) {
			System.out.println(ex); 
			}
		}
	public ArrayList<employeeDto> getAllEmployees(){
		ArrayList<employeeDto> arr = new ArrayList<employeeDto>();        
		if (openConnection()) {
			try {
				String sql="Select * from employee";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					employeeDto em=new employeeDto();
					em.setEmployeeID(rs.getString("EmployeeID"));
					em.setName(rs.getString("name"));
					em.setDOB(rs.getString("DOB"));
					em.setSalary(rs.getDouble("salary"));
					arr.add(em);
				}
			}catch (SQLException ex) {
				System.out.println(ex);
			} finally {
				closeConnection();
				} 
			}
		return arr;}
	public boolean fixEmployee(String id,employeeDto emp) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "UPDATE employee SET name = ?, DOB = ?, salary = ? WHERE employeeID = ?";
		     PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, emp.getName());
				stmt.setString(2, emp.getDOB());
				stmt.setDouble(3, emp.getSalary());
				stmt.setString(4, emp.getEmployeeID());
				if (stmt.executeUpdate()>=1)result = true;
			}catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
				return result;}
	public boolean addEmployee(employeeDto emp) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql ="Insert into employee values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, emp.getEmployeeID());
				stmt.setString(2, emp.getName());
				stmt.setString(3,emp.getDOB());
				stmt.setDouble(4, emp.getSalary());
				if (stmt.executeUpdate()>=1)result = true;
			}catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
				return result;}
	public boolean deleteEmployee(String idEmployee){
		  // Kết nối database
		boolean result = false;
		if (openConnection()) {
		  try {
		    // Tạo PreparedStatement
		    String sql = "DELETE FROM employee WHERE employeeID = ?";
		    PreparedStatement pstmt = con.prepareStatement(sql);

		    // Thay thế giá trị cho tham số
		    pstmt.setString(1, idEmployee);

		    // Thực thi câu lệnh SQL
		    int rowCount = pstmt.executeUpdate();

		    // Kiểm tra kết quả
		    if (rowCount > 0) {
		      System.out.println("Xóa employee thành công! ID: " + idEmployee);
		      result=true;
		    } else {
		      System.out.println("Xóa employee thất bại! ID: " + idEmployee);
		    }
		  }catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
		return result;
		}

	
	public  ArrayList<employeeDto> findAllEmployee(String id,String name){
		ArrayList<employeeDto> emp=new ArrayList<employeeDto>();
        if (openConnection()) {
        	String sql = "SELECT * FROM employee WHERE employeeID = ? AND name LIKE ?";
            
            
        try (PreparedStatement statement = con.prepareStatement(sql)) {
        	statement.setString(1,id);
        		statement.setString(2, "%"+name + "%" );
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                String id1 = resultSet.getString("employeeID");
                String name1 = resultSet.getString("name");
                String DOB = resultSet.getString("DOB");
                Double salary=resultSet.getDouble("salary");
                employeeDto em=new employeeDto();
                em.setEmployeeID(id1);
                em.setName(name1);
                em.setDOB(DOB);
                em.setSalary(salary);
               emp.add(em);
            }
        	
        	}catch (Exception e) {System.out.println(e);
        	}finally{closeConnection();  
		}
        }
		return emp;
	
}
}

		
	
	


