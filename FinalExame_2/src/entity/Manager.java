package entity;

public class Manager extends User {
	
		private String expInYear;

		public Manager(int id, String fullName, String email, String password, Role role, int projectId,
				String expInYear) {
			super(id, fullName, email, password, role, projectId);
			this.expInYear = expInYear;
		}

		public String getExpInYear() {
			return expInYear;
		}

		public void setExpInYear(String expInYear) {
			this.expInYear = expInYear;
		}

		@Override
		public String toString() {
			return "Manager [expInYear=" + expInYear + ", id=" + id + ", fullName=" + fullName + ", email=" + email
					+ ", password=" + password + ", role=" + role.MANAGER + ", projectId=" + projectId + "]";
		}

		
		
		
}
