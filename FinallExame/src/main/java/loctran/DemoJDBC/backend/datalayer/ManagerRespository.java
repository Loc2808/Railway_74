package loctran.DemoJDBC.backend.datalayer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import loctran.DemoJDBC.entity.Manager;
import loctran.DemoJDBC.utils.jdbcUtils;



public class ManagerRespository implements IManagerRespository {

	private jdbcUtils jdbcU;
	
	public ManagerRespository() {
		jdbcU = new jdbcUtils();
	}
	
	@Override
	public void getListManagerById(int id) throws ClassNotFoundException, SQLException, FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Connection con = jdbcU.getConnection();
		
		String sql = "SELECT * FROM manager "
				+ "\n"
				+ "WHERE id = ?";
		
		PreparedStatement pst = con.prepareStatement(sql);
		
		
		ResultSet rs = pst.executeQuery();
		
		while (rs.next()) {
			Manager manager = new Manager(rs.getInt("id"), rs.getString("full_name"), 
					rs.getString("email"), rs.getString("password"), rs.getString("pro_skill"),
					 rs.getString("role"), rs.get);
		}
		
		
		
	
	}
	
}
