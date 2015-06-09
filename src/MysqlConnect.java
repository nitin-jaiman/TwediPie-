/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package app.nitin.jaiman;

//import static app.nitin.jaiman.MysqlConnect.stmt;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MysqlConnect {

    static Connection con = null;
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   //static final String DB_URL = "jdbc:mysql://johnny.heliohost.org/prometh_twitterapp";
     static final String DB_URL = "jdbc:mysql://localhost/twitterappv2";
    //static final String USER = "prometh_dragon";
    static final String USER = "root";
     static final String PASS = "9983891211";
    static Statement stmt = null;

    public static Connection getConnection() {

        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to a selected database...");
            con = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected database successfully...");

        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        return con;
    }
/*
    public void insert() {
        try {
                String query="INSERT INTO signup " +
                   "VALUES (hggh, 'Mahnaz', 'Fatma')";
            
            //STEP 4: Execute a query
            System.out.println("Inserting records into the table...");
            stmt = con.createStatement();

            String sql = query;
            stmt.executeUpdate(sql);

            System.out.println("Inserted records into the table...");
        } catch (SQLException ex) {
            Logger.getLogger(MysqlConnect.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
*/
    
    public String reterive(String query){
    String username;		
        String password = null ;
         PreparedStatement stmt = null;
    try{Connection con = MysqlConnect.getConnection();
				stmt = con.prepareStatement(query);
				ResultSet rs = stmt.executeQuery(query) ;	
	
			while(rs.next()){
				
				username = rs.getString("username");
				password = rs.getString("password");
				
				System.out.println(username+ "," +password);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
    return password;
    
    }
    public void close() {
        //finally block used to close resources
        try {
            if (stmt != null) {
                con.close();
            }
        } catch (SQLException se) {
        }// do nothing
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException se) {
            se.printStackTrace();
        }//end finally try
        System.out.println("Goodbye!");
    }//end try

}
