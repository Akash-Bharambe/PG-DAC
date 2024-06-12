package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.entities.Department;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class DepartmentDaoTest {

	@Autowired
	private DepartmentDao deptDao;

	@Test
	void testSaveDepartments() {

		List<Department> list = List.of(new Department("RnD", "Bangalore"),
				new Department("Finance", "Mumbai"),
				new Department("HR", "Delhi"),
				new Department("Marketing", "Pune"));
		List<Department> list2 = deptDao.saveAll(list);
		assertEquals(4, list2.size());
	}

}
