package org.servlet;
import java.io.IOException;
import org.dao.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class RegisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			request.setCharacterEncoding("gb2312");
			String id=request.getParameter("id");
			String name=request.getParameter("name");
			String password=request.getParameter("password");
			if(new LoginDao().insertUser(id ,name, password)){
				response.sendRedirect("login.jsp");           //ע��ɹ���ת�� longin.jsp
			}
			else{                                             //ע��ʧ����ת�� failed.jsp
				response.sendRedirect("failed.jsp");
			}
		}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}
}
