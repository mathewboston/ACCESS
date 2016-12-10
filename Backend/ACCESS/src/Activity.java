
public class Activity {
	

	
	private int activityID;
	private String Type;
	private String title; 
	private String description; 
	private String startDate;
	private String keyword; 
	private String classification;
	private String courseName;
	private String semester;
	
	
	public Activity(String courseName, String semester){
		this.courseName = courseName;
		this.semester = semester;
	}
	
	//Knows course name
	public String getCourseName(){
		return courseName;
	} 
	
	//Knows semester
	public String getSemester(){
		return semester; 
	}
	
	//Knows associated initiatives, returns an array of 
	//the associated initiative ids
	public int[] getAssociatedInit(){
		int[] a = {123, 346, 234, 678};
		return a; 
	}
	
	//knows participant
	public void getParticipants(){
		
		//TODO: uses the participant info from the participant class
	/*	Participant.role
		Participant.name
		Participant.id
		Participant.email*/
	}
	
	//reads the activity
	public String readActivity(int activityID){
			String activityInfo = ""; 
			return activityInfo;
	}
	
	//updates the activity
	public void updateActivity(int activityID){
		
	}
	
	//creates new activity
	public String createActivity(String[] activityFields){
		String activity = "";
		return activity; 
	}
	
	//Deletes the activity
	public void deleteActivity(int activityID){
		
	}

}
