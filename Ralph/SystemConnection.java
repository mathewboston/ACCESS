
/**
 *
 * @author Ralph Woiwode
 */
public class SystemConnection extends DatabaseConnection {
    private String dbName;
    private String url;
    private String userName;
    private String password;
    
    public SystemConnection(){
        this.dbName = "ACCESS_DB";
        this.url = "127.0.0.1";
        this.userName = "e-LEMON-aders";
        this.password = "ACCESS_2016";
    }
}
