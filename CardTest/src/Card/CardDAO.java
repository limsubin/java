package Card;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class CardDAO {
	
	private Connection con = null;// ¸â¹ö º¯¼ö
	private static final String driverClassName = "org.mariadb.jdbc.Driver";
	private static final String dbServerURL = "jdbc:mariadb://localhost:3306/java";
	private static final String dbUserId = "root";
	private static final String dbUserPw = "0728";
	
	private void connect() {
		//DOM
		try {
			Class.forName(driverClassName);
			con = DriverManager.getConnection(dbServerURL, dbUserId, dbUserPw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	public void insertMember(Card m) throws Exception {

		
		try {
			connect();
			
			String sql = "insert into card values(?,?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, m.getId());
			pstmt.setString(2, m.getPw());
			pstmt.setString(3, m.getName());
			pstmt.setString(4, m.getAddr());

			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
			
		} finally {
			con.close();
		}
	}

	public void deleteMember(String id) throws Exception {
		
		try {
			connect();
			String sql = "delete from card where id = ?";
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, id);

			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
				con.close();
		}
	}

	public ArrayList<Card> listMembers() throws Exception {
		ArrayList<Card> list = new ArrayList<>();
		
		try {
			connect();
			
			String sql = "select * from card"; 
			PreparedStatement pstmt = con.prepareStatement(sql);

			
			ResultSet rs = pstmt.executeQuery();
			Card m = null;

			while (rs.next()) {
				
				String id = rs.getString(1); 
				String pw = rs.getString(2);
				String name = rs.getString(3); 
				String addr = rs.getString(4);

				
				m = new Card();
				
				m.setId(id);
				m.setPw(pw);
				m.setName(name);
				m.setAddr(addr);
				
				
				list.add(m);
				

			}
			

		} catch (Exception e) {
			throw e;
		} finally {
			
				con.close();
		}
		return list;
	}

	public void updateMember(Card m) throws Exception {
		try {
			connect();
			
			String sql = "update card set pw =?, name=?, addr = ? where id = ?";
			
			PreparedStatement pstmt = con.prepareStatement(sql);

			pstmt.setString(1, m.getPw());
			pstmt.setString(2, m.getName());
			pstmt.setString(3, m.getAddr());
			pstmt.setString(4, m.getId());

			pstmt.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			try {
				con.close();
			} catch (Exception ignore) {
				
			} 
		}
	}
	
	public int login(String id,String password){
		int x = -1;
		try{
	    	connect();
	    	String sql = "select pw from card where id = ?";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1, id);
	    	ResultSet rs = pstmt.executeQuery();
	    	if(rs.next()) {
	    		String dbpasswd = rs.getString("pw");
	    		if(dbpasswd.equals(password))
	    			x = 1;
	    		else
	    			x = -1;
	    	}
	    	
	    }catch(Exception e){
	    	
	    }finally {
	    	try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
		return x;

	}

}
