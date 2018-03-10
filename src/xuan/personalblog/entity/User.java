package xuan.personalblog.entity;

/**
 * User实体类
 *
 * @author xxuan
 * @date 2018年1月23日
 * @version v1.0
 */
public class User {
	private String userid;
	private String username;
	private String password;
	private String favicon;
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFavicon() {
		return favicon;
	}
	public void setFavicon(String favicon) {
		this.favicon = favicon;
	}
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", password=" + password + "]";
	}
}
