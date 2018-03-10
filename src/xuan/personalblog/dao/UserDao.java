package xuan.personalblog.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import xuan.personalblog.entity.User;
import xuan.personalblog.utils.DataSourceUtils;

/**
 * �û�Dao����¼��ע�ᣬ��֤�û����Ƿ����   ���޸����룬�޸�ͷ��
 * 
 * @author xxuan
 * @date 2018��2��4��
 * @version v1.0
 */
public class UserDao {
	
	//�û���¼��ѯ����
	public User login(String username,String password) throws SQLException{
		
		//����QueryRunner
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		//��дsql���
		String sql ="select * from user where username=? and password=?";
		//���ܲ�ѯ���
		User user = runner.query(sql, new BeanHandler<User>(User.class), username,password);
		//���ز�ѯ���
		return user;
	}
	
	
	//����û�����
	public int regist(User user) throws SQLException{
		//�������ݿ�
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		String sql = "insert into user values(?,?,?,?)";
		int isupdate = runner.update(sql,user.getUserid(),user.getUsername(),user.getPassword(),null);
		return isupdate;
	}
	
	
	//����û����Ƿ���ڷ���
	public User checkUsername(String username) throws SQLException{
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDatasouce());
		String sql = "select * from user where username=?";
		User checkuser = runner.query(sql, new BeanHandler<User>(User.class),username);
		return checkuser;
	}
}
