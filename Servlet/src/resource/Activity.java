
public class Activity extends Resource{
	
	public Activity(){
		super();
	}
	
	private int activityID;
	private String Type;
	private String title; 
	private String description; 
	private String startDate;
	private String keyword; 
	private String classification;
	
	//Knows course name
	public String getCourseName(){
		
	} 
	
	//Knows semester
	public String getSemester(){
		
	}
	
	//Knows associated initiatives, returns an array of 
	//the associated initiative ids
	public int[] getAssociatedInit(){
		
	}
	
	//knows participant
	public void getParticipants(){
		
		//TODO: uses the participant info from the participant class
		Participant.role
		Participant.name
		Participant.id
		Participant.email
	}
	
	//reads the activity
	public String readActivity(int activityID){
		
	}
	
	//updates the activity
	public void updateActivity(int activityID){
		
	}
	
	//creates new activity
	public String createActivity(String[] activityFields){
		
	}
	
	//Deletes the activity
	public void deleteActivity(int activityID){
		
	}

}
