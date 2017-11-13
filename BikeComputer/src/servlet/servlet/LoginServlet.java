package servlet.servlet;

import java.awt.Button;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.dao.UserDAO;
import servlet.dao.impl.UserDAOImpl;
import servlet.vo.User;

public class LoginServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res)
	   throws IOException,ServletException{
		
	}
	public void doPost(HttpServletRequest req,HttpServletResponse res)
			   throws IOException,ServletException{
		//get the username and password which user input
		User user=new User();
		user.setUsername(req.getParameter("username"));
		user.setPassword(req.getParameter("password"));
		UserDAO dao=new UserDAOImpl();
		int flag=0;
		try{
			flag=dao.queryByUsername(user);//check the username and password whether same in database
		}catch(Exception e){
			e.printStackTrace();
		}
		if(flag==1){
			try {
				user = dao.queryInfo(user);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			HttpSession session=req.getSession();
			session.setAttribute("username", user.getUsername());
			session.setAttribute("speed", user.getSpeed());
			session.setAttribute("heart",user.getHeart());
			session.setAttribute("cadence", user.getCadence());
			session.setAttribute("original", user.getOriginal());
			session.setAttribute("destination",user.getDestination());
			session.setAttribute("length",user.getLength());
			session.setAttribute("calorie",user.getCalorie());
			res.sendRedirect("./welcome.jsp");
		}else{
			res.sendRedirect("./error.jsp");
		}
	}
}
