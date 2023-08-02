package back_end.presentationlayer;

import java.sql.SQLException;
import java.util.List;

import back_end.businesslayer.IUserService;
import back_end.businesslayer.UserService;
import entity.Employee;
import entity.User;



public class UserController {
	
	private IUserService service;
	
	public UserController() {
		service = new UserService();
		
	}

	
	public List<User> getAllEmployee(int projectId) throws ClassNotFoundException, SQLException {
		return service.getAllEmployee(projectId);
	}

	
	public List<User> getAllManager() throws ClassNotFoundException, SQLException {
		return service.getAllManager();
	}

	
	public void loginAdmin(String email, String password) throws Exception {
		
			// validation
				
				
				if (password == null || password.length() > 20 || password.length() < 6) {
					throw new Exception(
							"Group Name must be greater than 6 characters and less than 20 characters");
				}
				// logic service
				
				
				service.loginAdmin(email, password);
				
	}	
	
	public User addCreateUser( String fullName, String Email) throws ClassNotFoundException, SQLException {
		
		
		
		return service.addCreateUser(fullName, Email);
	}
				
}