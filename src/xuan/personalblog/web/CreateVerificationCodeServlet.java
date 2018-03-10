package xuan.personalblog.web;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������֤���Servlet
 * 
 * @author xxuan
 * @date 2018��2��4��
 * @version v1.0
 */
public class CreateVerificationCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CreateVerificationCodeServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ͼƬ�߶�
		int IMG_HEIGHT = 110;
	    // ͼƬ���
	    int IMG_WIDTH = 45;
	    // ��֤�볤��
	    int CODE_LEN = 4;

	        // ���ڻ���ͼƬ������ͼƬ�ĳ����ͼƬ���ͣ�RGB)
	        BufferedImage bi = new BufferedImage(IMG_HEIGHT, IMG_WIDTH, BufferedImage.TYPE_INT_RGB);
	        // ��ȡ��ͼ����
	        Graphics graphics = bi.getGraphics();
	        graphics.setColor(new Color(100, 230, 200)); // ʹ��RGB���ñ�����ɫ
	        graphics.fillRect(0, 0, 120, 45); // ����������

	        // ��֤������ʹ�õ����ַ�
	        char[] codeChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456".toCharArray();
	        String captcha = ""; // ������ɵ���֤��
	        Random random = new Random();
	        for(int i = 0; i < CODE_LEN; i++) { // ѭ����ÿ����֤���ַ����Ƶ�ͼƬ��
	            int index = random.nextInt(codeChar.length);
	            // ���������֤����ɫ
	            graphics.setColor(new Color(random.nextInt(150), random.nextInt(200), random.nextInt(255)));
	            // ��һ���ַ����Ƶ�ͼƬ�ϣ����ƶ�λ�ã�����x,y���꣩
	            graphics.drawString(codeChar[index] + "", (i * 20) + 15, 20);
	            captcha += codeChar[index];
	        }
	        // �����ɵ���֤��code����sessoin��
	        request.getSession().setAttribute("verificationcode", captcha);
	        // ͨ��ImageIO��ͼƬ���
	        ImageIO.write(bi, "JPG", response.getOutputStream());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
