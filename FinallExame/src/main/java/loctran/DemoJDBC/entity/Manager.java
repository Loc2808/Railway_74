package loctran.DemoJDBC.entity;

public class Manager extends User {
	private String expInYear;
	
	
	public Manager(int id, String fullName, String email, String password, int projectId, String expInYear) {
		super(id, fullName, email, password, projectId);
		this.expInYear = expInYear;
	}


	public String getExpInYear() {
		return expInYear;
	}


	public void setExpInYear(String expInYear) {
		this.expInYear = expInYear;
	}

	
	
	
	
	

	
		
	

}
