package orm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAOimpl implements DepartmentDAO {

	public static final String INSERT_STMT = "insert into department values(?,?,?)";
	public static final String UPDATE_ST = "update department set loc = ? where deptno = ?";
	public static final String FIND_BY_DEPTNO = "select * from department where deptno = ?";
	public static final String DELETE_BY_DEPTNO = "delete from department where deptno = ?";
	public static final String GET_ALL = "select * from department order by deptno";
	
	// 載入驅動 此類別載入時 static 也跟著被載入
	static {
		try {
			Class.forName(Util.DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void save(Department department) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(INSERT_STMT);

			pstmt.setInt(1, department.getDeptno());
			pstmt.setString(2, department.getDname());
			pstmt.setString(3, department.getLoc());

			pstmt.executeUpdate();
			System.out.println("新增完成");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, null);
		}
	}

	@Override
	public void update(Department department) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL,Util.USER,Util.PASSWORD);
			pstmt = con.prepareStatement(UPDATE_ST);
			
			pstmt.setString(1, department.getLoc());
			pstmt.setInt(2, department.getDeptno());
			
			pstmt.executeUpdate();
			System.out.println("更新完成");
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(Integer deptno) {
		// TODO Auto-generated method stub
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = DriverManager.getConnection(Util.URL,Util.USER,Util.PASSWORD);
			pstmt = con.prepareStatement(DELETE_BY_DEPTNO);
			
			pstmt.setInt(1, deptno);
			
			pstmt.executeUpdate();
			
			System.out.println("刪除成功");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public Department findByDeptno(Integer deptno) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Department dept = null ;
		try {
			con = DriverManager.getConnection(Util.URL, Util.USER, Util.PASSWORD);
			pstmt = con.prepareStatement(FIND_BY_DEPTNO);

			pstmt.setInt(1, deptno);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				//用Department Bean 包裝查詢資料做回傳
				dept = new Department();
				dept.setDeptno(deptno);
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));				
			}	
			System.out.println("更新完成");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			Util.closeResources(con, pstmt, rs);
		}
		return dept;
	}

	@Override
	public List<Department> getAll() {
		Connection con = null;
		PreparedStatement pstmt = null ; 
		ResultSet rs = null ;
		List<Department> deptlist = new ArrayList<>();
		
		try {
			con = DriverManager.getConnection(Util.URL,Util.USER,Util.PASSWORD);
			pstmt = con.prepareStatement(GET_ALL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				Department dept = new Department();
				dept.setDeptno(rs.getInt(1));
				dept.setDname(rs.getString(2));
				dept.setLoc(rs.getString(3));
				
				//用集合收集著包裝好的資料結果(部門物件)
				deptlist.add(dept);
			}
			
			
		}catch(SQLException e){
			e.printStackTrace();
		}
		return deptlist;
	}

}
