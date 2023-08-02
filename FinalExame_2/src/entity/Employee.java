package entity;

public class Employee extends User {
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, Role role, int projectId, String proSkill) {
		super(id, fullName, email, password, role, projectId);
		this.proSkill = proSkill;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	@Override
	public String toString() {
		return "Employee [proSkill=" + proSkill + ", id=" + id + ", fullName=" + fullName + ", email=" + email
				+ ", password=" + password + ", role=" + role.EMPLOYEE + ", projectId=" + projectId + "]";
	}

	
	
	
	
}
