

import java.util.ArrayList;

public class PrivilegeProvider {
	
	//STUBS
	DatabaseConnectionManagerStub DatabaseConnectionManager = new DatabaseConnectionManagerStub();
	MemberManagerStub MemberManager = new MemberManagerStub();
	ResourceManagerStub ResourceManager = new ResourceManagerStub();
	
	ArrayList<String> lockedList;
	
	//PrivilegeProvider constructor
	public PrivilegeProvider(){
		lockedList = new ArrayList<String>();
	}
	
	//This method is used to determine what a member is allowed to see
	public ArrayList<ResourceManagerStub> disableAccess(String memberID){
		
		ArrayList<ResourceManagerStub> resources = DatabaseConnectionManager.delegate(memberID, 1);
		if(!(resources == null))
			return resources;
		return null;
	}
	
	public boolean identifyMember(String memberID){
	
		if("1".equals(memberID)) return true;
		return false;
	}
	//This method is used to identify the member and their viewing rights
	/*public ArrayList<String> identifyMember(String memberID){
		
		ArrayList<ResourceManagerStub> resources = DatabaseConnectionManager.delegate(memberID, 1);
		if(!(resources == null)){
			ArrayList<String> resourceList = new ArrayList<String>();
			int i = 0;
			while(i<resources.size()){
				String resource = resources.get(i).getTitle() + ",";
				resource += resources.get(i).getType() + ",";
				resource += resources.get(i).getRole() + ",";
				resource += resources.get(i).getLastModifiedDatee() + ",";
				resource += resources.get(i).getResourceID();
				resourceList.add(resource);
				i++;
			}			
			
			return resourceList;
		}
		return null;
	}*/
	
	//This method is used to allow a member to certain perform tasks
	public boolean authenticate(String memberID, String resourceID, String request){
		
		//We need to confirm member and resource exist
		String authentication = DatabaseConnectionManager.delegate(resourceID, memberID);
		if(request.equals(authentication)){
			return true;
		}
		return false;
	}
	
	//Determine by resource, what a member is allowed to do/see
	private ArrayList<ResourceManagerStub> accessByResource(String resourceID){
		
		ArrayList<ResourceManagerStub> resources = DatabaseConnectionManager.delegate(resourceID, 1);
		if(!(resources == null))
			return resources;
		return null;
	}
	
	//Determine by member role, what a member is allowed to do/see
	private ArrayList<ResourceManagerStub> accessByRole(String MemberID){
		
		ArrayList<ResourceManagerStub> resources = DatabaseConnectionManager.delegate(MemberID, 1);
		if(!(resources == null))
			return resources;
		return null;
	}
	
	//Determine by member type, what a member is allowed to do/see
	private ArrayList<ResourceManagerStub> accessByMemberType(String MemberID){
		
		ArrayList<ResourceManagerStub> resources = DatabaseConnectionManager.delegate(MemberID, 1);
		if(!(resources == null))
			return resources;
		return null;
	}
	
	//Locks a resource to prevent race conditions
	private boolean lockResource(String resourceID){
		
		boolean resourceLocked = false;
		if(!(DatabaseConnectionManager.delegate(resourceID)==null)){
			int i = 0;
			while(i < lockedList.size()){
				if(lockedList.get(i).equals(resourceID)){
					resourceLocked = true;
					break;
				}
				i++;
			}
			if(!resourceLocked){
				lockedList.add(resourceID);
				return true;
			}
			else
				return false;
		}
		
		throw new NullPointerException();
	}
	
	String st="  Project Title 1, Project, Owner, MM-DD-YYYY, R123456 ";
	
	//Unlocks a resource when a member is finished with it
	private boolean unlockResource(String resourceID){
		
		int i = 0;
		while(i < lockedList.size()){
			if(lockedList.get(i).equals(resourceID)){
				lockedList.remove(i);
				return true;
			}
			i++;
		}
		return false;
	}
}

 