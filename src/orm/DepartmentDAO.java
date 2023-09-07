package orm;

import java.util.List;

public interface DepartmentDAO {
	void save(Department department);

	void update(Department department);

	void delete(Integer deptno);

	Department findByDeptno(Integer deptno);

	List<Department> getAll();
}
