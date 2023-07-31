package loctran.DemoJDBC.entity;


public class User {
	private int id;
	private String fullName;
	private String email;
	private String password;
	private int projectId;
	
	
	public User(int id, String fullName, String email, String password, int projectId) {
		this.id = id;
		this.fullName = fullName;
		this.email = email;
		this.password = password;
		this.projectId = projectId;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public int getProjectId() {
		return projectId;
	}


	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	
	
	
}
	
	