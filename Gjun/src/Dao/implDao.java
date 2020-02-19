package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface implDao//¥ý¨ìmemberDao´ú¸Õ¡ASystem.out.println(implDao.getConn());
{
	static Connection getConn() 
	{
		String url="jdbc:mysql://localhost:3306/gjun?useUnicode=true&characterEncoding=utf-8";
		String user="root";
		String password="1234";
		
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	void add(Object o);
	ResultSet query();
	void update(int id,Object o);
	void delete(int id);
}
