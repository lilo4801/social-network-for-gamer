package dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBContext {
    
    private final String serverName ="localhost";
    private final String portName ="1143";
    private final String dbName = "SNG";
    private final String user = "sa";
    private final String password = "1";

    public Connection getConnection() throws Exception{
        String url = "jdbc:sqlserver://"+serverName+":"+portName+"; databaseName = "
                +dbName;
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url,user,password);
    }

}
