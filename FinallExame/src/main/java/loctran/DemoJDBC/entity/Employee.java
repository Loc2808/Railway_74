package loctran.DemoJDBC.entity;

public class Employee extends User{
	
	private String proSkill;

	public Employee(int id, String fullName, String email, String password, int projectId, String proSkill) {
		super(id, fullName, email, password, projectId);
		this.proSkill = proSkill;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}
	
	

	

}
