package entity;

public class Admin extends User {

	public Admin(int id, String fullName, String email, String password, Role role, int projectId) {
		super(id, fullName, email, password, role, projectId);
		
		
	}

	@Override
	public String toString() {
		return "Admin [id=" + id + ", fullName=" + fullName + ", email=" + email + ", password=" + password + ", role="
				+ role.ADMIN + ", projectId=" + projectId + "]";
	}

}
