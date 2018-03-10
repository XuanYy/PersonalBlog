package xuan.personalblog.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xuan.personalblog.service.UserService;


/**
 * ����û����Ƿ��ظ���Servlet
 * 
 * @author xxuan
 * @date 2018��3��7��
 * @version v1.0
 */
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckUsernameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//���ղ���
		String usernameInput = request.getParameter("username");
		//����Service��checkUsername����
		UserService service = new UserService();
		Boolean isntExist = false;
		try {
			isntExist = service.checkUsername(usernameInput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (isntExist) {
			//�����ڷ���true
			response.getWriter().write("{\"isntExist\":\"true\"}");
		}else{
			response.getWriter().write("{\"isntExist\":\"false\"}");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
