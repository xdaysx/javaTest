package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Dao.porderDao;
import model.porder;


@WebServlet("/ok1")
public class ok1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ok1() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		porder p=(porder)session.getAttribute("P");
		new porderDao().add(p);
		response.sendRedirect("mporder/ok2.jsp");
	}

	
	

}
