
import java.util.ArrayList;

/**
 *
 * @author Ralph Woiwode
 */
public class Database {
    ArrayList<Resource> table;
    
    // Constructors
    public Database(){
        this.table = new ArrayList<E>();
    }
    
    public Database(ArrayList<E> resources){
        this.table = new ArrayList<E>(resources);
    }
    
    // Getters & Setters
    public ArrayList<E> getTable(){
        return this.table;
    }
    
    public void setTable(ArrayList<E> resources){
        this.table = new ArrayList(resources);
    }
    
    // Methods
    public int getID(int resourceID){
        int id = 0;
        return id;
    }
    
    public boolean retrieveResource(int resourceID){
        return true;
    }
    
    public boolean deleteResource(int resourceID){
        return true;
    }
}
