package Dao;

public class Datos {
	//Base de datos
	private String driver;
	private String url;
	private String user;
	private String pass;

	public Datos() {
		this.driver = "com.mysqlsql.jdbc.Driver";
		this.url = "jdbc:postgresql://localhost:3306/jardineria";
		this.user = "admin";
		this.pass = "admin1";
	}

	public String getDriver() {
		return driver;
	}

	public String getUrl() {
		return url;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}
}
