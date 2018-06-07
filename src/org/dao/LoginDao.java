package org.dao;
import java.sql.*;
import org.model.*;
import org.db.*;
import java.util.ArrayList;
public class LoginDao {
	Connection conn=DBconn.getConn(); ;                                      //���ݿ����Ӷ���
	PreparedStatement pstmt;
	public Login checkLogin(String name,String password){ //��֤�û�������
		try{
			pstmt=conn.prepareStatement("select * from admin where name=? " + " and password=?");
			pstmt.setString(1, name);                     //����SQL������
			pstmt.setString(2, password);                 //����SQL������
			ResultSet rs=pstmt.executeQuery();            //ִ�в�ѯ�����ؽ����
			if(rs.next()){                                //ͨ��JavaBean����ֵ
				Login login=new Login();	
				login.setId(rs.getString(1));
				login.setName(rs.getString(2));
				login.setPassword(rs.getString(3));				
				return login;                             //����JavaBean����
			}
			return null;                                  //��֤ʧ�ܷ���null
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	public  ArrayList<MessBoar> findMbInfo(){
		try{
			ArrayList<MessBoar> al=new ArrayList<MessBoar>();
			pstmt=conn.prepareStatement("select * from message");
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				MessBoar mb=new MessBoar();
				mb.setId(rs.getString(1));
				mb.setName(rs.getString(2));
				mb.setTime(rs.getDate(3));
				mb.setTitle(rs.getString(4));
				mb.setMessage(rs.getString(5));
				al.add(mb);
			}
			return al;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
		public String getName(String id){
			String name=null;
			try{
				pstmt=conn.prepareStatement("select name from admin where id=?");
				pstmt.setString(1, id);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()){
					 name=rs.getString(1);
				}
				return name;
			}catch(Exception e){
				e.printStackTrace();
				return null;
			}
		}

		public boolean addInfo(MessBoar mb){
			try{
				pstmt=conn.prepareStatement("insert into message values(?,?,?,?,?)");
				pstmt.setString(1, mb.getId());
				pstmt.setString(2, mb.getName());
				pstmt.setDate(3, mb.getTime());
				pstmt.setString(4, mb.getTitle());
				pstmt.setString(5, mb.getMessage());
				pstmt.executeUpdate();
				return true;
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}
		public boolean insertUser(String id,String name,String password){
			try{
				pstmt=conn.prepareStatement("insert into admin values(?,?,?)");
				pstmt.setString(1, id);
				pstmt.setString(2, name);				
				pstmt.setString(3, password);
			
				pstmt.executeUpdate();
				return true;
			}catch(Exception e){
				e.printStackTrace();
				return false;
			}
		}


}
