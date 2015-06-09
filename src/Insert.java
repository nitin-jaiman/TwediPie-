/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//package app.nitin.jaiman;

//import MysqlConnect.con;
//import static MysqlConnect.con;
//import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Insert {
    Connection con=MysqlConnect.getConnection();
    public int insersignup(String uname, String mail, String pword) throws SQLException{
    try { System.out.println("Inserting records into the table...");
                String query="INSERT INTO user (username, email, password)" +
        "VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(query);
preparedStatement.setString(1, uname);
preparedStatement.setString(2, mail);
preparedStatement.setString(3, pword);
preparedStatement.executeUpdate(); 
            //STEP 4: Execute a query
           
        

            System.out.println("Inserted records into the table...");
        } catch (MySQLIntegrityConstraintViolationException  ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("something went wrong :(");
            return 1;
        }

    System.out.println("Inserted successfully");
    return 0;
    }
    
    public void inserDetails(String uname, String pword){
        try {
            String query2="INSERT INTO details (username,password)" +
                    "VALUES (?, ?)";
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
            preparedStatement2.setString(1, uname);
            preparedStatement2.setString(2, pword);
            
            preparedStatement2.executeUpdate(); 
            System.out.println("Inserted successfully");
            // GeoGui.status.setText("You can now login");
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        //GeoGui.status.setText("Username not available");
        
        }
    
    
    }
    
    
    public void inserUserDatabase(HashSet<String> userlist,String trend,String username){
       
        try {
          
            for(String element:userlist){
            String query2="INSERT INTO details (username,trend,userlist)" +
                    "VALUES (?,?,?)";
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
       preparedStatement2.setString(1, username);
            preparedStatement2.setString(2, trend);
       
            preparedStatement2.setString(3, element);
      
            
            preparedStatement2.executeUpdate(); 
            System.out.println("Inserted successfully");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
   
    
     public void createColoumn(String coloumn,String databasename){
        try {
  
        
            String query2="ALTER TABLE `prometh_twitterapp`.`"+databasename+"` ADD COLUMN `"+coloumn+"` VARCHAR(50) ";
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
          
            
            preparedStatement2.executeUpdate(); 
            System.out.println("created  successfully");
            
     
        } catch (SQLException ex) {
            System.out.println("Trend already present");
        }
    
    
    }
    
    
     public void createTable(String username){
        try {
            String query2="CREATE TABLE `prometh_twitterapp`.`"+username+"`( `TrendList` VARCHAR(50) )"; 
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
          
            
            preparedStatement2.executeUpdate(); 
            System.out.println("table created successfully successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    } 
    public void createison(String username){
        try {
            String query2="CREATE TABLE `prometh_twitterapp`.`"+username+"`( `issubscriptionon` BOOLEAN )"; 
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
          
            
            preparedStatement2.executeUpdate(); 
            System.out.println("table created successfully ");
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    } 
      public void InsertIsOn(String username){
        try {
            String query2="INSERT INTO `prometh_twitterapp`.`"+username+"`(`issubscriptionon`) VALUES ( 1)"; 
            PreparedStatement preparedStatement2 = con.prepareStatement(query2);
          
            
            preparedStatement2.executeUpdate(); 
            System.out.println("table created successfully successfully");
        } catch (SQLException ex) {
            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    } 
     
     
     public ResultSet getResultSet(String trendfield,String username){
       
            
        try{  
            Statement stm=(Statement)con.createStatement();
            String Query="SELECT userlist FROM details WHERE trend = '"+trendfield+"' AND "+" username = '"+username+"'"; 
            ResultSet rs=stm.executeQuery(Query);
            
            System.out.println("inside getResultSet ");
            return rs;
           
        }catch(SQLException e){
            System.out.println("__________________________________->");
        e.printStackTrace();
       
        return null;
        }
    
    }
     
      public ResultSet getTrends(String username){
       
          
        try{  
            Statement stm=(Statement)con.createStatement();
            String Query="SELECT DISTINCT trend FROM details WHERE username = '"+username+"'"; 
            ResultSet rs=stm.executeQuery(Query);
            
            System.out.println("inside getTrends : Done successfully ");
            return rs;
           
        }catch(SQLException e){
        e.printStackTrace();
      
        return null;
        }
    
    }
       public ResultSet getIsOn(String username){
       
   
        try{ 
            Statement stm=(Statement)con.createStatement();
            System.out.println("inside getison");
            String Query="SELECT * FROM `prometh_twitterapp`.`"+username+"`"; 
            ResultSet rs=stm.executeQuery(Query);
            
            System.out.println("inside getIsOn : Done successfully ");
            return rs;
           
        }catch(SQLException e){
        e.printStackTrace();
       
        return null;
        }
    
    }
     
        public String sqlMessage(){
       
   String fetch=null;
        try{ 
            Statement stm=(Statement)con.createStatement();
            System.out.println("inside getison");
            String Query="SELECT * FROM `prometh_twitterapp`.`sqlmessage`"; 
            ResultSet rs=stm.executeQuery(Query);
            
            while(rs.next()){
            fetch=rs.getString("subscriptionmessage");
            
            }
            
            
            System.out.println("inside sqlMessage : Done successfully ");
       return fetch;
           
        }catch(SQLException e){
        e.printStackTrace();
       
       return "you subcription has expired";
        }
    
    }
       
  public String getUpdateStatus(){
       
   String fetch=null;
        try{ 
            Statement stm=(Statement)con.createStatement();
            System.out.println("inside getison");
            String Query="SELECT * FROM `prometh_twitterapp`.`updatestatus`"; 
            ResultSet rs=stm.executeQuery(Query);
            
            while(rs.next()){
            fetch=rs.getString("tweet");
            
            }
            
            
            System.out.println("inside getUpdateStatus : Done successfully ");
       return fetch;
           
        }catch(SQLException e){
        e.printStackTrace();
       
       return "you subcription has expired";
        }
    
    }     
       
      
}
