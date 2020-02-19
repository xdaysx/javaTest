package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Dao.implDao;
import Dao.memberDao;
import model.porder;

public class porderDao implements implDao{
	public static void main(String[] args) throws SQLException {
		/*新增
		 porder p=new porder();
		p.setName("b");
		p.setPro1(1);
		p.setPro2(1);
		p.setPro3(1);
		p.setPro4(1);
		p.setPro5(1);
		p.setPro6(1);
		p.setPro7(1);
		p.setPro8(1);
		new porderDao().add(p);*/
		
		/*查詢ResultSet rs=new porderDao().query();
		while(rs.next())
		{
			System.out.println("Id="+rs.getInt("id")+
								"\tName="+rs.getString("name")+
								"\tPro1="+rs.getInt("pro1")+
								"\tPro2="+rs.getInt("pro2")+
								"\tPro3="+rs.getInt("pro3")+
								"\tSum="+rs.getInt("sum"));
		}*/
		
		//刪除new porderDao().delete(1);
		
		porder p=new porder();
		p.setName("tom");
		new porderDao().update(1, p);
	}

	@Override
	public void add(Object o) {
		porder p=(porder)o;
		String sql="insert into porder(name,pro1,pro2,pro3,pro4,pro5,pro6,pro7,pro8,sum) value(?,?,?,?,?,?,?,?,?,?)";
		Connection conn=implDao.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, p.getName());
			ps.setInt(2, p.getPro1());
			ps.setInt(3, p.getPro2());
			ps.setInt(4, p.getPro3());
			ps.setInt(5, p.getPro4());
			ps.setInt(6, p.getPro5());
			ps.setInt(7, p.getPro6());
			ps.setInt(8, p.getPro7());
			ps.setInt(9, p.getPro8());
			ps.setInt(10, p.getSum());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ResultSet query() {
		String sql="select * from porder";
		Connection conn=implDao.getConn();
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery(sql);
			return rs;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void update(int id, Object o) {
		porder	p=(porder)o;
		String sql="update porder set name='"+p.getName()+"' where id="+id;
		Connection conn=implDao.getConn();
		try {
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}
	public void updateall(int id,int pro1,int pro2,int pro3,int pro4,int pro5,int pro6,int pro7,int pro8)
	{
		int sum=pro1*160+pro2*70+pro3*90+pro4*130+pro5*1880+pro6*980+pro7*1080+pro8*520;
		String sql="update porder set pro1="+pro1+" ,pro2="+pro2+" ,pro3="+pro3+" ,pro4="
											+pro4+" ,pro5="+pro5+" ,pro6="+pro6+" ,pro7="
											+pro7+" ,pro8="+pro8+" ,sum="+sum+" where id="+id;
		Connection conn=implDao.getConn();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("no");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		String sql="delete from porder where id="+id;
		Connection conn=implDao.getConn();
		try {
			Statement st=conn.createStatement();
			st.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
