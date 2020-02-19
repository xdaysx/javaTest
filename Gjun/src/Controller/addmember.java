package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.memberDao;
import Dao.memberQuery;
import model.member;


@WebServlet("/addmember")
public class addmember extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public addmember() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		
		String NAME=request.getParameter("name");
		String USER=request.getParameter("user");
		String PASSWORD=request.getParameter("password");
		String MOBILE=request.getParameter("mobile");
		String PHONE=request.getParameter("phone");
		String ADDRESS=request.getParameter("address");
		String EMAIL=request.getParameter("email");
		String TYPE=request.getParameter("type");
		boolean x=memberQuery.checkUser(USER);
		
		if(x==true)
		{
			response.sendRedirect("error.jsp");
		}
		else
		{
			member m=new member();
			m.setName(NAME);
			m.setUser(USER);
			m.setPassword(PASSWORD);
			m.setMobile(MOBILE);
			m.setPhone(PHONE);
			m.setAddress(ADDRESS);
			m.setEmail(EMAIL);
			m.setType(TYPE);
			new memberDao().add(m);
			
			response.sendRedirect("success.jsp");
		}
	}

}
