import java.util.ArrayList;

public class resourceManager {
	

	    public resourceManager(){}
	    
	    public void resource(ArrayList<E> type){
	        ArrayList<E> method = type;
	        
	        if(method.get(0) == 0){ // 0 -> project
	            Project project = new Project();
	            
	        }
	        else if(method.get() == 1) { // 1 -> FundedProject
	            FundedProject fundedProject = new FundedProject();
	        }
	        else if(method.get() == 2) { // 2 -> NonFundedProject
	            NonFundedProject nonFundedProject = new NonFundedProject();
	        }
	        else if(method.get() == 3) { // 3 -> Initiative
	            Initiative initiative = new Initiative();
	        }
	        else if(method.get() == 4) { // 3 -> Activity
	            Activity activity = new Activity(null, null);
	        }
	    }
}
	