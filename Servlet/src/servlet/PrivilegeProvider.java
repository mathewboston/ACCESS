package servlet;

public class PrivilegeProvider {
	
	//PrivilegeProvider constructor
	public PrivilegeProvider(){}
	
	//This method is used to determine what a member is allowed to see
	public void disableAccess(String MemberID){}
	
	//This method is used to
	public Rescources[] identifyMember(String MemberID){
		
		return null;
	}
	
	//This method is used to allow a member to certain perform tasks
	public boolean authenticate(String MemberID, String ResourceID){
		
		return false;
	}
	
	//Determine by resource, what a member is allowed to do/see
	private int accessByResource(String ResourceID){
		
		return -1;
	}
	
	//Determine by member role, what a member is allowed to do/see
	private int accessByRole(String MemberID){
		
		return -1;
	}
	
	//Determine by member type, what a member is allowed to do/see
	private int accessByMemberType(String MemberID){
		
		return -1;
	}
	
	//Locks a resource to prevent race conditions
	private boolean lockResource(String ResourceID, String MemberID){
		
		return false;
	}
	
	//Unlocks a resource when a member is finished with it
	private boolean unlockResource(String ResourceID){
		
		return false;
	}

}

 
