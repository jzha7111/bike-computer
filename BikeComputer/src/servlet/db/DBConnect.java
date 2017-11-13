package servlet.db;


import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.PreparedStatement;

public class DBConnect {  //connect database
	    private final String DBDRIVER = "com.mysql.jdbc.Driver" ; //database driver  
	    private final String DBURL = "jdbc:mysql://127.0.0.1:3306/JavaWebDB" ;  //the address of database 
	    private final String DBUSER = "root" ;   
	    private final String DBPASSWORD = "19950525nn^^" ;   
	    private Connection conn = null ;
	    public java.sql.PreparedStatement pst = null;
	  
	    public DBConnect()   {   
	        try{   
	            Class.forName(DBDRIVER) ;   
	            this.conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD) ;  
	        }catch (Exception e){ 
	        	System.out.println(e.getMessage());  
	        	}   
	    }   
	    // get the database connection
	    public Connection getConnection(){   
	        return this.conn ;   
	    }   
	    // close the database connection
	    public void close(){   
	        try{   
	            this.conn.close() ;   
	        }catch (Exception e){ }          
	    }
	    public void insert(String registersql) {
			// TODO Auto-generated method stub
			try {  
			    Class.forName(DBDRIVER);//specify the connection type
	            conn = DriverManager.getConnection(DBURL,DBUSER,DBPASSWORD);//get connection
	            pst = conn.prepareStatement(registersql);//prepare for execute statement
	            pst.executeUpdate();
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
		}   
}  
