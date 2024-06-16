package com.jobs.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jobs.entities.Job;

public interface JobsRepository extends JpaRepository<Job, Long> {
	
	@Query(value = "select j from Job j where j.salary > :salary")
	public List<Job> getJobsHavingSalaryMoreThan(Double salary);
	
}
