package orm;

import java.util.Scanner;

public class DepartmentTest {

	public DepartmentTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("要新增的編號");
//		int deptno = sc.nextInt();
//		System.out.println("要新增的名稱");
//		String dname = sc.next();
//		System.out.println("要新增的所在地");
//		String loc = sc.next();
//		
//		sc.close();
//		
//		
//		//Department Bean 包裝新增資料
//		Department dept = new Department(deptno,dname,loc);
//		//透過deptdao物件呼叫方法完成新增資料
//		DepartmentDAO deptdao = new DepartmentDAOimpl();
//		deptdao.save(dept);
		
		
//		System.out.println("要查詢的編號");
//		int deptno = sc.nextInt();
//		Department Bean 包裝新增資料
//		Department dept =null;
//		//透過deptdao物件呼叫方法完成新增資料
//		DepartmentDAO deptdao = new DepartmentDAOimpl();
//		dept = deptdao.findByDeptno(deptno);
//		System.out.println(dept);
		
		
//		System.out.println("要更新的編號");
//		int deptno = sc.nextInt();
//		System.out.println("更新地點是：");
//		String loc = sc.next();
//		DepartmentDAO deptdao = new DepartmentDAOimpl();
//		Department dept = new Department(deptno,null,loc);
//		deptdao.update(dept);
		
//		System.out.println("要刪除的編號是");
//		int deptno = sc.nextInt();
//		DepartmentDAO deptdao = new DepartmentDAOimpl();
//		deptdao.delete(deptno);
		
		System.out.println("查詢表格");
		DepartmentDAO deptdao = new DepartmentDAOimpl();
//		List<Department> deptlist = deptdao.getAll();
		for(Department dept : deptdao.getAll()) {
			System.out.println(dept);
		}
	}

}
