package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.member;
import model.porder;


@WebServlet("/addporder")
public class addporder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public addporder() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
		member m=(member)session.getAttribute("M");
		int pro1=Integer.parseInt(request.getParameter("pro1"));
		int pro2=Integer.parseInt(request.getParameter("pro2"));
		int pro3=Integer.parseInt(request.getParameter("pro3"));
		int pro4=Integer.parseInt(request.getParameter("pro4"));
		int pro5=Integer.parseInt(request.getParameter("pro5"));
		int pro6=Integer.parseInt(request.getParameter("pro6"));
		int pro7=Integer.parseInt(request.getParameter("pro7"));
		int pro8=Integer.parseInt(request.getParameter("pro8"));
		
		porder p=new porder();
		p.setName(m.getName());
		p.setPro1(pro1);
		p.setPro2(pro2);
		p.setPro3(pro3);
		p.setPro4(pro4);
		p.setPro5(pro5);
		p.setPro6(pro6);
		p.setPro7(pro7);
		p.setPro8(pro8);
		
		session.setAttribute("P", p);
		
		response.sendRedirect("mporder/confirm.jsp");
	}

	
	
}
