package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DTO.customerDto;
import DTO.employeeDto;

public class customerDao {
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
	public ArrayList<customerDto> getAllCustomer(){
		ArrayList<customerDto> arr = new ArrayList<customerDto>();        
		if (openConnection()) {
			try {
				String sql="Select * from customer";
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
				while(rs.next()){
					customerDto cm=new customerDto();
					cm.setCustomerID(rs.getString("customerID"));
					cm.setName(rs.getString("name"));
					cm.setAddress(rs.getString("address"));
					cm.setPhone(rs.getNString("phone"));
					arr.add(cm);
				}
			}catch (SQLException ex) {
				System.out.println(ex);
			} finally {
				closeConnection();
				} 
			}
		return arr;}
	public boolean fixCustomer(String id,customerDto emp) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql = "UPDATE customer SET name = ?, address = ?, phone = ? WHERE customerID = ?";
		     PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, emp.getName());
				stmt.setString(2, emp.getAddress());
				stmt.setString(3, emp.getPhone());
				stmt.setString(4, emp.customerID);
				if (stmt.executeUpdate()>=1)result = true;
			}catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
				return result;}
	public boolean addCustomer(customerDto emp) {
		boolean result = false;
		if (openConnection()) {
			try {
				String sql ="Insert into customer values(?,?,?,?)";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1, emp.getCustomerID());
				stmt.setString(2, emp.getName());
				stmt.setString(3,emp.getAddress());
				stmt.setString(4, emp.getPhone());
				if (stmt.executeUpdate()>=1)result = true;
			}catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
				return result;}
	public boolean deleteCustomer(String idEmployee){
		  // Kết nối database
		boolean result = false;
		if (openConnection()) {
		  try {
		    // Tạo PreparedStatement
		    String sql = "DELETE FROM customer WHERE customerID = ?";
		    PreparedStatement pstmt = con.prepareStatement(sql);

		    // Thay thế giá trị cho tham số
		    pstmt.setString(1, idEmployee);

		    // Thực thi câu lệnh SQL
		    int rowCount = pstmt.executeUpdate();
		    if (rowCount > 0) {
			      System.out.println("Xóa customer thành công! ID: " + idEmployee);
			      result=true;
			    } else {
			      System.out.println("Xóa customer thất bại! ID: " + idEmployee);
			    }
		    // Kiểm tra kết quả
		  }catch (SQLException ex) {System.out.println(ex);
			}finally{closeConnection();  } }
		return result;
		}
	public  ArrayList<customerDto> findAllCustomer(String id,String name){
		ArrayList<customerDto> emp=new ArrayList<customerDto>();
        if (openConnection()) {
        	String sql = "SELECT * FROM customer WHERE customerID = ? AND name LIKE ?";
            
            
        try (PreparedStatement statement = con.prepareStatement(sql)) {
        		statement.setString(1,id);
        		statement.setString(2, "%"+name + "%" );
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()) {
                String id1 = resultSet.getString("customerID");
                String name1 = resultSet.getString("name");
                String address = resultSet.getString("address");
                String phone =resultSet.getString("phone");
                customerDto em=new customerDto();
                em.setCustomerID(id1);
                em.setName(name1);
                em.setAddress(address);
                em.setPhone(phone);
               emp.add(em);
            }
        	
        	}catch (Exception e) {System.out.println(e);
        	}finally{closeConnection();  
		}
        }
		return emp;
	
}
}
