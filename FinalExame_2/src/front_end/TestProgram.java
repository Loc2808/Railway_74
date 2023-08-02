package front_end;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Utils.ScannerUtils;
import back_end.presentationlayer.UserController;
import entity.User;

public class TestProgram {
	public static void main(String[] args) throws ClassNotFoundException,
	SQLException{
		
		UserController controller = new UserController();
		
		// get all employee by project_id
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("input project_id: ");
		
		int projectId = ScannerUtils.inputInt(sc, "please input Integer!");
		
		try {
			controller.getAllEmployee(projectId);
			
			System.out.println("get successfull!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			System.out.println("create fail!");
		}
		
		// get all manager
		
		List<User> managers = controller.getAllManager();

		
		for (User user : managers) {
			System.out.println(user);
		}
		
		// get login admin
		
		String email = sc.next();
		String password = sc.next();
		
		try {
			controller.loginAdmin(email, password);
			System.out.println("get successfull!");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}
