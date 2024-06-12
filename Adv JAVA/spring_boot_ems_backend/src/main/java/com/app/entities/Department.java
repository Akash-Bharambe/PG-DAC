package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "emps")
public class Department extends BaseEntity {
	@Column(name = "dept_name", length = 40, unique = true)
	private String deptName;
	@Column(length = 30)
	private String location;	
	// one to many
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> emps = new ArrayList<>();
	

	// as per Gavin King's IMPORTANT suggestion add helper methods to add/remove
	// child
	public void addEmployee(Employee e) {
		emps.add(e);// dept --> emp
		e.setDept(this);// emp --> dept
	}
	public void removeEmployee(Employee e) {
		emps.remove(e);
		e.setDept(null);
	}
	public Department(String deptName, String location) {
		super();
		this.deptName = deptName;
		this.location = location;
	}

}
