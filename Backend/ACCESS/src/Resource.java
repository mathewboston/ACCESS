
public class Resource {

	private String type;
	private String title;
	private String description;
	private String startDate;
	private String endDate;
	private String owner;
	private int id;
	private String resource; 
	
	public Resource(String resource){
		this.resource = resource; 
	}
	
	//Creates instance of resource to be managed
	public String getResource(){
		return resource; 
	}
	
	
	//archives the resource and deletes it
	public void archiveResource(int resourceID){
		
	}
	
	
}
