package back_end.businesslayer;

import java.sql.SQLException;
import java.util.List;

import back_end.datalayer.IUserRespository;
import back_end.datalayer.UserRespository;
import entity.Employee;
import entity.User;

public class UserService implements IUserService {
	
	private IUserRespository respository;
	
	public UserService() {
		respository = new UserRespository();
		
	}

	@Override
	public List<User> getAllEmployee(int projectId) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return respository.getAllEmployee(projectId);
	}

	@Override
	public List<User> getAllManager() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return respository.getAllManager();
	}

	@Override
	public void loginAdmin(String email, String password) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		respository.loginAdmin(email, password);
	}

	@Override
	public User addCreateUser(String fullName, String Email) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return respository.addCreateUser(fullName, Email);
	}
	
}
