package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    private static final String url="jdbc:mysql://localhost:3306/hotel_db";
    private static final String username="root";
    private static final String password="Wb@758004nak";

   public Connection connectdb() throws SQLException {
       try{
           Class.forName("com.mysql.cj.jdbc.Diver");
       }catch(ClassNotFoundException e){
           e.printStackTrace();
       }

       Connection connection= DriverManager.getConnection(url,username,password);
       return connection;
   }

   public void HaltConnection(){
       
   }

}
