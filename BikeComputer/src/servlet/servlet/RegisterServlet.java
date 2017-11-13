package servlet.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.dao.UserDAO;
import servlet.dao.impl.UserDAOImpl;
import servlet.vo.User;

public class RegisterServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	   throws IOException,ServletException{
		this.doPost(req, res);
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			   throws IOException,ServletException{
		User user=new User();
		user.setUsername(req.getParameter("username"));
		int flag=1;
		if(!req.getParameter("password1").equals(req.getParameter("password2"))){//check the twice password is same or not
			flag=0;
			System.out.print("password is defferent!");
		}//no:flag=0
		else{//yes:flag=1£¬put password into user,
			user.setPassword(req.getParameter("password1"));
			user.setGender(req.getParameter("gender"));
			user.setHight(req.getParameter("hight"));
			user.setWeight(req.getParameter("weight"));
			user.setAge(req.getParameter("age"));
			user.setOccupation(req.getParameter("occupation"));
		
			UserDAO dao=new UserDAOImpl();
			try{
				flag=dao.checkRename(user);//name is used flag=0, unused flag=1
			}catch(Exception e){
				e.getMessage();
			}
			if(flag==1){
				flag=0;
				try{
						flag=dao.insertUserinfo(user);
					}catch(Exception e){
						e.getLocalizedMessage();
					}
			}	
			}//flag=1£¬successfully insert into database
			if(flag==1){
					HttpSession session=req.getSession();
					session.setAttribute("username", user.getUsername());
					res.sendRedirect("./welcome.jsp");
				}
			else{
				System.out.println("fail");
					res.sendRedirect("./error.jsp");
				}
		}
}	
			


