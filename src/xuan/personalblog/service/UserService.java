package xuan.personalblog.service;

import java.sql.SQLException;

import xuan.personalblog.dao.UserDao;
import xuan.personalblog.entity.User;

/**
 * 用户Service类：注册，登录，验证用户名是否存在	（修改密码，修改头像）
 * 
 * @author xxuan
 * @date 2018年2月4日
 * @version v1.0
 */
public class UserService {
	
	//登录service方法
	public Boolean login(String username, String password) {
		
		//调用dao层的login方法
		UserDao dao = new UserDao();
		User userlogin = null;
		try {
			userlogin = dao.login(username,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//判断userlogin是否为空
		if(userlogin!=null){
			//不为空返回true
			return true;
		}else{
			//为空返回false
			return false;
		}
	}

	
	//注册service方法
	public boolean regist(User user) throws SQLException {
		UserDao dao = new UserDao();
		//判断是否插入成功
		int isupdate = dao.regist(user);
		if(isupdate==1){
			//插入成功返回true
			return true;
		}else{
			//插入失败返回false
			return false;
		}
	}
	
	
	//验证用户名是否存在service方法
	public boolean checkUsername(String username) throws SQLException{
		UserDao dao = new UserDao();
		//调用Dao层checkUsername方法并接收返回值
		User checkUsername = dao.checkUsername(username);
		//判断返回值是否为空
		if (checkUsername==null) {
			//为空，用户名不重复
			return true;
		}else{
			//不为空，用户名已存在
			return false;
		}
	}
}
