import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;


public class MySQLConnectionTest {
    
    private static final String DRIVER = "org.mariadb.jdbc.Driver";
    private static final String URL = "jdbc:mariadb://han81.synology.me:3807/pegasushan";
    private static final String USER = "root";
    private static final String PW = "HANdbslzhs@0401";
    
    @Test
    public void testConnection() throws Exception {
        Class.forName(DRIVER);
        
        try(Connection conn = (Connection) DriverManager.getConnection(URL, USER, PW)) {
            System.out.println(conn);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
}