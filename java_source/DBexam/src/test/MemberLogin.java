package test;

import java.sql.*;

public class MemberLogin {
	public static void main(String[] args) throws ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		
		String sql = "SELECT * FROM Members WHERE userID = ? AND userPW = ?";
		try(Connection conn = DriverManager.getConnection(url, user, password);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1,args[0]);
			pstmt.setString(2,args[1]);
			ResultSet rs = pstmt.executeQuery();
		
			if(rs.next() == true) {
				System.out.print("로그인 성공");
			} else {
				System.out.print("로그인 실패");
			}
			rs.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
