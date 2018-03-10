package xuan.personalblog.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

/**
 * c3p0工具类
 * 
 * @author xxuan
 * @date 2017年11月14日
 * @version v1.0
 */
public class DataSourceUtils {
	public static ComboPooledDataSource datasouce = new ComboPooledDataSource();
	
	public static DataSource getDatasouce(){
		return datasouce;
	}
	
	public static Connection getConnection(){
		try {
			return datasouce.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
