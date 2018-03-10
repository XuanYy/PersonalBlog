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
 * �û�ע��Servlet
 *
 * @author xxuan
 * @date 2018��1��23��
 * @version v1.0
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//��ȡ��������
		//String username = request.getParameter("username");
		//String password = request.getParameter("password");
		
		//�����ݷ�װ��javaBean
		//User user = new User();
		//user.setUsername(username);
		//user.setPassword(password);
		
		//��ȡ�������֤��
		String inputverificationcode = request.getParameter("verificationcode");
		//��ȡ�����session�е���֤��
        String verificationcode = (String) request.getSession().getAttribute("verificationcode");

        if(verificationcode.toLowerCase().equals(inputverificationcode.toLowerCase())) { // ��֤�벻���ִ�Сд
		//��֤����ȷ
		//ʹ��Beanutils����ӳ���װ 
        	Map<String, String[]> properties = request.getParameterMap();
        	User user = new User();
        	try {
        		BeanUtils.populate(user, properties);
        	} catch (IllegalAccessException e) {
        		e.printStackTrace();
        	} catch (InvocationTargetException e) {
        		e.printStackTrace();
        	}
		
        	//ʹ��UUID�ֶ���װuserid  �������
        	user.setUserid(UUID.randomUUID().toString());
		
        	UserService service = new UserService();
        	Boolean isupdate = false;
        	try {
        		//����Service���regist���� ���շ���ֵ
        		isupdate = service.regist(user);
        	} catch (SQLException e) {
        		e.printStackTrace();
        	}
        	if(isupdate){
        		//ע��ɹ����ض���success.jspҳ��
        		response.sendRedirect(request.getContextPath()+"/success.jsp");
        	}else{
        	//��֤�����
        	//��֤ʧ�ܣ���request���д洢������Ϣ
			request.setAttribute("loginInfo", "��֤���������������");
			//ת����login.jsp
			request.getRequestDispatcher("/register.jsp").forward(request, response);;
        	}
        }
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}

	