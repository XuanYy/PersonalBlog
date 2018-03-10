package xuan.personalblog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xuan.personalblog.service.UserService;

/**
 * 用户登录Servlet
 * 
 * @author xxuan
 * @date 2018年2月4日
 * @version v1.0
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//中文乱码问题
		request.setCharacterEncoding("UTF-8");
		//获取输入数据
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		//获取输入的验证码
		String inputverificationcode = request.getParameter("verificationcode");
		
		// 获取存放在session中的验证码
        String verificationcode = (String) request.getSession().getAttribute("verificationcode");

        if(verificationcode.toLowerCase().equals(inputverificationcode.toLowerCase())) { // 验证码不区分大小写
            //验证成功 验证用户名密码是否正确
        	//调用service层的login方法
    		UserService Service = new UserService();
    		Boolean isSuccess = Service.login(username,password);
    		//判断是否登录成功
    		if(isSuccess==true){
    			//登录成功重定向到index.jsp
    			response.sendRedirect(request.getContextPath()+"/index.jsp");
    		}else{
    			//登录失败，向request域中存储错误信息
    			request.setAttribute("loginInfo", "用户名或密码错误，请重新输入");
    			//转发到login.jsp
    			request.getRequestDispatcher("/login.jsp").forward(request, response);;
    		}
        } else { // 验证失败
        	//验证失败，向request域中存储错误信息
			request.setAttribute("loginInfo", "验证码错误，请重新输入");
			//转发到login.jsp
			request.getRequestDispatcher("/login.jsp").forward(request, response);;
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
