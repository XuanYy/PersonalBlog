package xuan.personalblog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import xuan.personalblog.service.UserService;

/**
 * �û���¼Servlet
 * 
 * @author xxuan
 * @date 2018��2��4��
 * @version v1.0
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//������������
		request.setCharacterEncoding("UTF-8");
		//��ȡ��������
		String username =request.getParameter("username");
		String password = request.getParameter("password");
		//��ȡ�������֤��
		String inputverificationcode = request.getParameter("verificationcode");
		
		// ��ȡ�����session�е���֤��
        String verificationcode = (String) request.getSession().getAttribute("verificationcode");

        if(verificationcode.toLowerCase().equals(inputverificationcode.toLowerCase())) { // ��֤�벻���ִ�Сд
            //��֤�ɹ� ��֤�û��������Ƿ���ȷ
        	//����service���login����
    		UserService Service = new UserService();
    		Boolean isSuccess = Service.login(username,password);
    		//�ж��Ƿ��¼�ɹ�
    		if(isSuccess==true){
    			//��¼�ɹ��ض���index.jsp
    			response.sendRedirect(request.getContextPath()+"/index.jsp");
    		}else{
    			//��¼ʧ�ܣ���request���д洢������Ϣ
    			request.setAttribute("loginInfo", "�û����������������������");
    			//ת����login.jsp
    			request.getRequestDispatcher("/login.jsp").forward(request, response);;
    		}
        } else { // ��֤ʧ��
        	//��֤ʧ�ܣ���request���д洢������Ϣ
			request.setAttribute("loginInfo", "��֤���������������");
			//ת����login.jsp
			request.getRequestDispatcher("/login.jsp").forward(request, response);;
        }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request,response);
	}

}
