package xuan.personalblog.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xuan.personalblog.service.UserService;


/**
 * 检查用户名是否重复的Servlet
 * 
 * @author xxuan
 * @date 2018年3月7日
 * @version v1.0
 */
public class CheckUsernameServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckUsernameServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收参数
		String usernameInput = request.getParameter("username");
		//调用Service层checkUsername方法
		UserService service = new UserService();
		Boolean isntExist = false;
		try {
			isntExist = service.checkUsername(usernameInput);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if (isntExist) {
			//不存在返回true
			response.getWriter().write("{\"isntExist\":\"true\"}");
		}else{
			response.getWriter().write("{\"isntExist\":\"false\"}");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
