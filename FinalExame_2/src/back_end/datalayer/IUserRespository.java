package back_end.datalayer;

import java.sql.SQLException;
import java.util.List;

import entity.Employee;
import entity.User;

public interface IUserRespository {
	
	List<User> getAllEmployee (int projectId) throws ClassNotFoundException, SQLException;
	
	List<User> getAllManager() throws ClassNotFoundException, SQLException;
	
	void loginAdmin(String email, String password) throws ClassNotFoundException, SQLException;
	
	User addCreateUser(String fullName, String Email) throws ClassNotFoundException, SQLException;
}
