import java.sql.*;
import java.util.Properties;
import javax.sql.*;
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
    
    public Connection connectToDatabase() throws SQLException {
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", this.userName);
        connectionProps.put("password", this.password);

        if (this.dbms.equals("mysql")) {
            conn = DriverManager.getConnection("jdbc:" + this.dbms + "://" + this.serverName + ":" + this.portNumber + "/", connectionProps);
        } 
        else if (this.dbms.equals("derby")) {
            conn = DriverManager.getConnection("jdbc:" + this.dbms + ":" + this.dbName + ";create=true", connectionProps);
        }
        System.out.println("Connected to database");
        return conn;
    }
}