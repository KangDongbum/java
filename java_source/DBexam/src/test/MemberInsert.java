package test;

import java.sql.*;

public class MemberInsert {
	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/madang";
		String user = "root";
		String password = "aA!12345";
		String sql = "Call InsertMember(?,?,?)";
		try(Connection conn = DriverManager.getConnection(url,user,password);
			PreparedStatement pstmt = conn.prepareStatement(sql)){
			pstmt.setString(1,args[0]);
			pstmt.setString(2,args[1]);
			pstmt.setString(3,args[2]);
			int rs = pstmt.executeUpdate();
			System.out.println("row : " +rs);
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
