package com.app.entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="emp_performance")
@NoArgsConstructor
@Getter
@Setter
public class ProjectEmployeeDetails {
	@EmbeddedId //composite PK
	private ProjectEmployeeId projectEmpId=new ProjectEmployeeId();
	private double empPerformanceIndex;
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("projectId")
	@JoinColumn(name="project_id")
	private Project myProject;
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("employeeId")
	@JoinColumn(name="emp_id")
	private Employee myEmployee;
	public ProjectEmployeeDetails(ProjectEmployeeId projectEmpId) {
		super();
		this.projectEmpId = projectEmpId;
	}
	
}
