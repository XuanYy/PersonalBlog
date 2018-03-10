package xuan.personalblog.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import xuan.personalblog.entity.User;
import xuan.personalblog.utils.DataSourceUtils;

/**
 * 用户Dao：登录，注册，验证用户名是否存在   （修改密码，修改头像）
 * 
 * @author xxuan
 * @date 2018年2月4日
 * @version v1.0
 */
public class UserDao {
	
	//用户登录查询方法
	public User login(String username,String password) throws SQLException{
		
		//创建QueryRunner
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		//书写sql语句
		String sql ="select * from user where username=? and password=?";
		//接受查询结果
		User user = runner.query(sql, new BeanHandler<User>(User.class), username,password);
		//返回查询结果
		return user;
	}
	
	
	//添加用户方法
	public int regist(User user) throws SQLException{
		//存入数据库
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		String sql = "insert into user values(?,?,?,?)";
		int isupdate = runner.update(sql,user.getUserid(),user.getUsername(),user.getPassword(),null);
		return isupdate;
	}
	
	
	//检测用户名是否存在方法
	public User checkUsername(String username) throws SQLException{
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		String sql = "select * from user where username=?";
		User checkuser = runner.query(sql, new BeanHandler<User>(User.class),username);
		return checkuser;
	}
}
