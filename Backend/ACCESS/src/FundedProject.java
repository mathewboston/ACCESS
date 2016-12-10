
public class FundedProject extends Resource{
	
	private String PIName; 
	private String Co_PIName; 
	
	//Assign Co-PI as PA of the Project
	//TODO: What are we returning? 
	public assignPA(int memberID){
		
		//TODO: How are we going to use this method to assign the Co-PI to be a PA? 
		retrieveFundedProjectInfo();
	}
	
	//Assign PI as the Owner of the Project
	//TODO: What are we returning? 
	public assignOwner(int memberID){
		
		//TODO: How are we going to use this method to assign the PI as the owner? 
		retrieveFundedProjectInfo();
		
	}

}
