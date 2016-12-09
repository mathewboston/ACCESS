import java.util.*;

public class NonFundedProject extends Project{
	private ArrayList<Member> membership;
	private ArrayList<Initiative> associatedInitiative;
	
	
	public NonFundedProject() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ArrayList<Member> getMembership() {
		return membership;
	}


	public void setMembership(ArrayList<Member> membership) {
		this.membership = membership;
	}


	public ArrayList<Initiative> getAssociatedInitiative() {
		return associatedInitiative;
	}


	public void setAssociatedInitiative(ArrayList<Initiative> associatedInitiative) {
		this.associatedInitiative = associatedInitiative;
	}
	
	
}
