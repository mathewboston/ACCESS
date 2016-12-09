import java.util.*;

public class Initiative extends Resource {
	private String title;
	private String description;
	private String Category;
	private String creationDate;
	private String owner;
	private ArrayList<Project> associatedProjects;
	private ArrayList<Activity> associatedActivities;
	private String startDate;
	private String endDate;
	private String[] keywords;
	private String documentAttachedType;
	private String website;
	private String purpose;
	private ArrayList<Member> memberhsip;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public ArrayList<Project> getAssociatedProjects() {
		return associatedProjects;
	}
	public void setAssociatedProjects(ArrayList<Project> associatedProjects) {
		this.associatedProjects = associatedProjects;
	}
	public ArrayList<Activity> getAssociatedActivities() {
		return associatedActivities;
	}
	public void setAssociatedActivities(ArrayList<Activity> associatedActivities) {
		this.associatedActivities = associatedActivities;
	}
	private String getStartDate() {
		return startDate;
	}
	private void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	private String getEndDate() {
		return endDate;
	}
	private void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	private String[] getKeywords() {
		return keywords;
	}
	private void setKeywords(String[] keywords) {
		this.keywords = keywords;
	}
	private String getDocumentAttachedType() {
		return documentAttachedType;
	}
	private void setDocumentAttachedType(String documentAttachedType) {
		this.documentAttachedType = documentAttachedType;
	}
	private String getWebsite() {
		return website;
	}
	private void setWebsite(String website) {
		this.website = website;
	}
	private String getPurpose() {
		return purpose;
	}
	private void setPurpose(String purpose) {
		this.purpose = purpose;
	}
	private ArrayList<Member> getMemberhsip() {
		return memberhsip;
	}
	private void setMemberhsip(ArrayList<Member> memberhsip) {
		this.memberhsip = memberhsip;
	}
	
	
	
	
	
}
