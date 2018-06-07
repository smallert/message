package org.servlet;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dao.LoginDao;
import org.model.*;

public class LeaveMessageServlet extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		// �����������
				request.setCharacterEncoding("gb2312");
				// ������Ӧ����
				response.setContentType("gb2312");
				// ��ȡtitle����
				String title=request.getParameter("title");
				// ��ȡmessage����
				String message=request.getParameter("message");
				// ��session��ȡ����ǰ�û�����
				Login leaveMessageBoard=(Login) request.getSession().getAttribute("admin");
				// �������Ա��ӦJavaBean���󣬰����ݷ�װ��ȥ
				MessBoar mb=new MessBoar();
				mb.setId(leaveMessageBoard.getId());
				// ����Ϊ��ȡ�ĵ�ǰʱ��
				mb.setName(leaveMessageBoard.getName());
				mb.setTime(new Date(System.currentTimeMillis()));
				mb.setTitle(title);
				mb.setMessage(message);
				// ��DB���еķ����ж��Ƿ����ɹ�
				if(new LoginDao().addInfo(mb)){
					response.sendRedirect("success.jsp") ;
				}
		}
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		doGet(request,response);
	}
}
