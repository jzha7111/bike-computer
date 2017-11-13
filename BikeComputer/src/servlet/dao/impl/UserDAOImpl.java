package servlet.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import servlet.dao.UserDAO;
import servlet.db.DBConnect;
import servlet.vo.User;

public class UserDAOImpl implements UserDAO {

	public int queryByUsername(User user) throws Exception {
		// TODO Auto-generated method stub
		int flag=0;
		String sql = "select * from userinfo where username=?";//this is the sql language which is used in MySQL
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());//insert the value into the ?
			ResultSet rs = pstmt.executeQuery();//set rsserver.createobject
			if(rs.next()){//compare the password which user input and that in the database if it's same then flag=1
				if(rs.getString("password").equals(user.getPassword())){
					flag = 1;
				}
			}
			else{
				
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		finally{
			dbc.close();
		}
		return flag;
	}
	public User queryInfo(User user) throws Exception{
		// TODO Auto-generated method stub
		int flag=0;
		String sql = "select * from userinfo where username=?";//this is the sql language which is used in MySQL
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());//insert the value into the ?
			ResultSet rs = pstmt.executeQuery();//set rsserver.createobject
			if(rs.next()){//compare the password which user input and that in the database if it's same then flag=1
				user.setSpeed(rs.getString("speed"));
				user.setHeart(rs.getString("heart"));
				user.setCadence(rs.getString("Cadence"));
				user.setOriginal(rs.getString("Original"));
				user.setDestination(rs.getString("Destination"));
				user.setLength(rs.getString("length"));
				user.setCalorie(rs.getString("calorie"));
			}
			else{
				
			}
			rs.close();
			pstmt.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		finally{
			dbc.close();
		}
		return user;
	}
	public int insertUserinfo(User user) throws Exception {
		// TODO Auto-generated method stub
		int flag=0;
		String sql = "insert into userinfo(username,password,gender,hight,weight,age,occupation) values(?,?,?,?,?,?,?)";//this is the sql language which is used in MySQL
		DBConnect dbc = null;
		PreparedStatement pstmt = null;
		try{
			dbc = new DBConnect();
				pstmt = dbc.getConnection().prepareStatement(sql);
				//insert the value into the ?
				pstmt.setString(1, user.getUsername());
				pstmt.setString(2, user.getPassword());
				pstmt.setString(3, user.getGender());
				pstmt.setString(4, user.getHight());
				pstmt.setString(5, user.getWeight());
				pstmt.setString(6, user.getAge());
				pstmt.setString(7, user.getOccupation());
				pstmt.executeUpdate();//set rsserver.createobject
				flag=1;
			pstmt.close();
			}catch(SQLException e){
				System.out.println(e.getMessage());
			}
		finally{
			dbc.close();
		}
		return flag;
	}
	
	public int checkRename(User user) throws Exception {
		int flag=0;
		String sql = "select * from userinfo where username=?";//this is the sql language which is used in MySQL
		PreparedStatement pstmt = null;
		DBConnect dbc = null;
		try{
			dbc = new DBConnect();
			pstmt = dbc.getConnection().prepareStatement(sql);
			pstmt.setString(1, user.getUsername());//insert the value into the ?
			ResultSet rs = pstmt.executeQuery();//query the user name in database
			if(rs.next() == false){
				flag=1;
			}
			else{
				
			}
			pstmt.close();
		}catch(SQLException e){
			System.out.println(e.getMessage());
		}
		finally{
			dbc.close();
		}
		return flag;
	}

}
