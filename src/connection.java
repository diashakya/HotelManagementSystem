
//package hotelmanagementsystem-01;


import java.sql.*;
public class connection {
    Connection c;
    Statement s;
    public connection(){
        
        
        try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          String url = "jdbc:mysql://localhost:3306/necresort";
          c = DriverManager.getConnection(url,"root","");
          s = c.createStatement();
          System.out.println("connected Success");
        }
        catch(Exception e){
        e.printStackTrace();
        System.out.println("Exception");
        }
            
      
    }
    public static void main(String args[]){
       new connection();
    }
}
