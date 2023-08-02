package back_end.datalayer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Utils.JDBCUtils;
import entity.Employee;
import entity.Manager;
import entity.Role;
import entity.User;

public class UserRespository implements IUserRespository{
	
	
	@Override
	public List<User> getAllEmployee(int projectId) throws ClassNotFoundException, SQLException {
		
		List<User> employees = new ArrayList<>();
		Connection con = JDBCUtils.getConnection();
		
		String sql = "select * from user where project_id = ?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		pst.setInt(1, projectId);
		
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("id"); 
			String fullName	= rs.getString("full_name");
			String email =	rs.getString("email"); 
			String password = rs.getString("password"); 
			Role role = Role.valueOf(rs.getString("role")); 
			
			
			if (role == Role.EMPLOYEE) {
				
				String proSkill = rs.getString("pro_skill");
				
				Employee emp = new Employee(id, fullName, email, password, role, projectId, proSkill);
				
				employees.add(emp);
			}
			
		}
		
		JDBCUtils.disconnect();
		
		return employees;
	}

	@Override
	public List<User> getAllManager() throws ClassNotFoundException, SQLException {

		List<User> managers = new ArrayList<>();
		Connection con = JDBCUtils.getConnection();
		
		String sql = "select * from user";
		
		PreparedStatement pst = con.prepareStatement(sql);
				
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			int id = rs.getInt("id"); 
			String fullName	= rs.getString("full_name");
			String email =	rs.getString("email"); 
			String password = rs.getString("password"); 
			Role role = Role.valueOf(rs.getString("role")); 
			int projectId = rs.getInt("project_id");
			
			if (role == Role.MANAGER) {
				
				String expInYear = rs.getString("exp_in_year");
				
			Manager mag = new Manager(id, fullName, email, password, role, projectId, expInYear);
			
			managers.add(mag);
			}
			
		}
		
		JDBCUtils.disconnect();
		
		return managers;
	
	}

	@Override
	public void loginAdmin(String email, String password) throws ClassNotFoundException, SQLException {
		
		
		Connection con = JDBCUtils.getConnection();
		
		String sql = "select * from user where email = ? and 'password' = ?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, email);
		pst.setString(2, password);
				
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id"); 
			String fullName	= rs.getString("full_name"); 
			Role role = Role.valueOf(rs.getString("role")); 
			int projectId = rs.getInt("project_id");
			
			if (role == Role.ADMIN) {
				
				String expInYear = rs.getString("exp_in_year");
				Manager mag = new Manager(id, fullName, email, password, role, projectId, expInYear);
				
				System.out.println("list of manager:"+ mag.toString());	
				
			}else {
				System.out.println("please input email and password of Admin!");
			}
		
	}
		JDBCUtils.disconnect();
}

	

	@Override
	public User addCreateUser(String fullName, String email) throws ClassNotFoundException, SQLException {
		
		User addcreate = null;
		Connection con = JDBCUtils.getConnection();
		
		String sql = "insert into user(full_name, email) "
				+ "values (?, ?)";
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1, fullName);
		pst.setString(2, email);
			
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
		
		Role role = Role.valueOf(rs.getString("role"));	
		
			if (role == Role.EMPLOYEE) {
				
				String password = "123456";
				
				Employee emp = new Employee(id, fullName, email, password, role, 0, null);
				
				System.out.println("list of manager:"+ emp.toString());	
				
			
			}
		
	}
		
		JDBCUtils.disconnect();
		
		return addcreate;
		
	}
}
	
