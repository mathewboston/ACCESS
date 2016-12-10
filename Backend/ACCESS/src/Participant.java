
public class Participant {
	private String role;
	private String name;
	private int ID;
	private String email;
	

	public Participant(String role, String name, int iD, String email) {
		super();
		this.role = role;
		this.name = name;
		ID = iD;
		this.email = email;
	}


	private String getRole() {
		return role;
	}


	private void setRole(String role) {
		this.role = role;
	}


	private String getName() {
		return name;
	}


	private void setName(String name) {
		this.name = name;
	}


	private int getID() {
		return ID;
	}


	private void setID(int iD) {
		ID = iD;
	}


	private String getEmail() {
		return email;
	}


	private void setEmail(String email) {
		this.email = email;
	}
	
	
}
