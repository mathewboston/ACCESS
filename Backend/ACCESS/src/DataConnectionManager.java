
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author owner
 */
public class DataConnectionManager {
    
    public DataConnectionManager(){
    
    }
    
    public void delegateTask(ArrayList<E> request){
        ArrayList<E> method = request;
        
        if(method.get(0) == 0){ // 0 -> Banner
            BannerInfo banner = new BannerInfo();
            banner.retrieveInfo(request);
        }
        else if(method.get() == 1) { // 1 -> Digital Measures
            DigitalMeasuresInfo digitalm = new DigitalMeasuresInfo();
            digitalm.retrieveInfo(request);
        }
        else if(method.get() == 2) { // 2 -> ORSP
            ORSP_Info orsp = new ORSP_Info();
            orsp.retrieveInfo(request);
        }
        else if(method.get() == 3) { // 3 -> ACCESS
            Database db = new Database();
            db.retrieveInfo(request);
        }
    }
}
