package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class HelloJDBC {

	public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/jdbcsample?serverTimezone=Asia/Taipei";
	public static final String USER = "root";
	public static final String PASSWORD = "ren123";

	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
//		
//		sc.close();
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		Statement stmt = null;
		ResultSet rs = null;
//		try {
//			// 1載入驅動
//			Class.forName(DRIVER);
//			System.out.println("載入成功");
//
//			// 2建立連線
//			con = DriverManager.getConnection(URL, USER, PASSWORD);
//			System.out.println("連線成功");
//
//			// 3SQL指令
////			stmt = con.createStatement();
////			int count = stmt.executeUpdate("insert into department values (50,'人事部','南京復興')");
////			System.out.println(count + " rows.updated");
//
//			pstmt = con.prepareStatement("insert into department values (?,?,?)");
//			pstmt.setInt(1, deptno);  //(欄位索引,輸入的資料變數)
//			pstmt.setString(2, dname);
//			pstmt.setString(3, loc);
//			
//			pstmt.executeUpdate();
//			
//
//
//
//
////			rs = pstmt.executeQuery("SELECT * FROM department");
////			while (rs.next()) {
////				deptno = rs.getInt("deptno");
////				dname = rs.getString("dname");
////				loc = rs.getString("loc");
////				System.out.println(deptno+" "+dname+" "+loc);
////				System.out.println(dname);
////				System.out.println(loc);
////				System.out.println("===================");
////			}
//
//			
//			
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		} finally {
//			if (rs != null) {
//				try {
//					rs.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (pstmt != null) {
//				try {
//					pstmt.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if (con != null) {
//				try {
//					con.close();
//				} catch (SQLException e) {
//					e.printStackTrace();
//				}
//			}
//		}
		try{
		    con = DriverManager.getConnection(URL, USER, PASSWORD);
		    stmt = con.createStatement();

		// Line 29
		    stmt.executeUpdate("INSERT INTO employee(EMPNO, ENAME) VALUES(7015, 'DAVID','null')");

		// Line 30
		    stmt.executeUpdate("INSERT INTO employee(EMPNO, ENAME) VALUES(7016, 'JAMES')");

		// Line 31
		    stmt.executeUpdate("INSERT INTO employee(EMPNO, ENAME) VALUES(7017, 'VINCENT')");

		// Line 32
		    stmt.executeUpdate("INSERT INTO employee(EMPNO, ENAME) VALUES(7018, 'RON')");

		    con.rollback();

		} catch (SQLException se) {
		    se.printStackTrace();
		}
	}

}
