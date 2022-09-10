import java.sql.*;

public class connectDatabase {
    public static void main(String[] args){
        String connectionString="jdbc://AENON\\SQLEXPRESS; Database=cafeManagement; IntegratedSecurity=true";
        try{
            try(Connection connection =DriverManager.getConnection(connectionString)){
                System.out.println("Connection established.");

            }
        }

        catch(SQLException e){
            System.out.println("Error connection to the databse");
            e.printStackTrace();
        }
    }
    
}
