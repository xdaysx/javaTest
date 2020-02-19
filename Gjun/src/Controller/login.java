package Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.memberQuery;
import model.member;


@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String USER=request.getParameter("user");
		String PASSWORD=request.getParameter("password");
		
		ResultSet rs=memberQuery.checkMember2(USER, PASSWORD);
		member m;
		HttpSession session=request.getSession();
		try {
			if(rs.next())
			{
				if(rs.getString("type").equals("member"))
				{
					response.sendRedirect("login/member.jsp");
				}else
				{
					response.sendRedirect("login/admin.jsp");
				}
				
				m=new member();
				m.setName(rs.getString("name"));
				session.setAttribute("M", m);
					
			}else
			{
				response.sendRedirect("addmember.jsp");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
