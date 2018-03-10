package xuan.personalblog.service;

import java.sql.SQLException;

import xuan.personalblog.dao.UserDao;
import xuan.personalblog.entity.User;

/**
 * �û�Service�ࣺע�ᣬ��¼����֤�û����Ƿ����	���޸����룬�޸�ͷ��
 * 
 * @author xxuan
 * @date 2018��2��4��
 * @version v1.0
 */
public class UserService {
	
	//��¼service����
	public Boolean login(String username, String password) {
		
		//����dao���login����
		UserDao dao = new UserDao();
		User userlogin = null;
		try {
			userlogin = dao.login(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//�ж�userlogin�Ƿ�Ϊ��
		if(userlogin!=null){
			//��Ϊ�շ���true
			return true;
		}else{
			//Ϊ�շ���false
			return false;
		}
	}

	
	//ע��service����
	public boolean regist(User user) throws SQLException {
		UserDao dao = new UserDao();
		//�ж��Ƿ����ɹ�
		int isupdate = dao.regist(user);
		if(isupdate==1){
			//����ɹ�����true
			return true;
		}else{
			//����ʧ�ܷ���false
			return false;
		}
	}
	
	
	//��֤�û����Ƿ����service����
	public boolean checkUsername(String username) throws SQLException{
		UserDao dao = new UserDao();
		//����Dao��checkUsername���������շ���ֵ
		User checkUsername = dao.checkUsername(username);
		//�жϷ���ֵ�Ƿ�Ϊ��
		if (checkUsername==null) {
			//Ϊ�գ��û������ظ�
			return true;
		}else{
			//��Ϊ�գ��û����Ѵ���
			return false;
		}
	}
}
