package test;

import java.sql.*;

public class MemberDelete {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		String sql = "Call DeleteMember(?)";
		try(Connection conn = DriverManager.getConnection(url, user, password);
			 PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setInt(1,Integer.parseInt(args[0]));
			
			int rs = pstmt.executeUpdate();
			System.out.println("row : " + rs);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
