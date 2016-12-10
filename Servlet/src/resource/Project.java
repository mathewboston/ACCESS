import java.util.*;
public class Project extends Resource {
	private String type;
	private String[] keywords;
	private String documentType;
	private String documentAttachmentType;
	private String website;
	private String goal;
	private String Objective;
	
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String[] getKeywords() {
		return keywords;
	}
	public void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	public String getDocumentType() {
		return documentType;
	}
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}
	public String getDocumentAttachmentType() {
		return documentAttachmentType;
	}
	public void setDocumentAttachmentType(String documentAttachmentType) {
		this.documentAttachmentType = documentAttachmentType;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getObjective() {
		return Objective;
	}
	public void setObjective(String objective) {
		Objective = objective;
	}
	
	
	public Project readProject(String projectName){
		Project toRead = getResource("project", projectName);
		return Project
		
	}
	
}
