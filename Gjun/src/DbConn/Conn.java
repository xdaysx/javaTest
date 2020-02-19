package DbConn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

	public static Connection Conn() {
		String url="jdbc:mysql://localhost:3306/gjun";
		String user="root";
		String password="1234";
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");//要先在WEB-INF的lib裡放入Tomcat的Driver才能執行
			conn=DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			System.out.println("no Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("no Connection");
			e.printStackTrace();
		}
		
		return conn;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(Conn.Conn());

	}

}
