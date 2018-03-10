package xuan.personalblog.web;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import xuan.personalblog.entity.User;
import xuan.personalblog.service.UserService;


/**
 * 用户注册Servlet
 *
 * @author xxuan
 * @date 2018年1月23日
 * @version v1.0
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//获取输入数据
		//String username = request.getParameter("username");
		//String password = request.getParameter("password");
		
		//将数据封装到javaBean
		//User user = new User();
		//user.setUsername(username);
		//user.setPassword(password);
		
		//获取输入的验证码
		String inputverificationcode = request.getParameter("verificationcode");
		//获取存放在session中的验证码
        String verificationcode = (String) request.getSession().getAttribute("verificationcode");

        if(verificationcode.toLowerCase().equals(inputverificationcode.toLowerCase())) { // 验证码不区分大小写
		//验证码正确
		//使用Beanutils进行映射封装 
        	Map<String, String[]> properties = request.getParameterMap();
        	User user = new User();
        	try {
        		BeanUtils.populate(user, properties);
        	} catch (IllegalAccessException e) {
        		e.printStackTrace();
        	} catch (InvocationTargetException e) {
        		e.printStackTrace();
        	}
		
        	//使用UUID手动封装userid  随机生成
        	user.setUserid(UUID.randomUUID().toString());
		
        	UserService service = new UserService();
        	Boolean isupdate = false;
        	try {
        		//调用Service层的regist方法 接收返回值
        		isupdate = service.regist(user);
        	} catch (SQLException e) {
        		e.printStackTrace();
        	}
        	if(isupdate){
        		//注册成功，重定向到success.jsp页面
        		response.sendRedirect(request.getContextPath()+"/success.jsp");
        	}else{
        	//验证码错误
        	//验证失败，向request域中存储错误信息
			request.setAttribute("loginInfo", "验证码错误，请重新输入");
			//转发到login.jsp
			request.getRequestDispatcher("/register.jsp").forward(request, response);;
        	}
        }
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

	