
public class Member {
	private String type;
	private String name;
	private String role;
	
	
	public Member(){}
	
	public Member(String type, String name, String role) {
		this.type = type;
		this.name = name;
		this.role = role;
	}
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	public void addMembership(int memberID, int resourceID){
		//TODO: which method from database? 
		
		
	}
	
	
	
}
