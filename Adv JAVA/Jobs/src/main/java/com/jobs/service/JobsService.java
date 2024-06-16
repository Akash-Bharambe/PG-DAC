package com.jobs.service;

import java.util.List;

import com.jobs.DTO.JobDTO;

public interface JobsService {

	List<JobDTO> getAllJobs();

	JobDTO getJob(Long id);

	JobDTO addJob(JobDTO jobDTO);

	String updateJob(Long id, JobDTO jobDTO);

	String deleteJob(Long id);

	List<JobDTO> getBySalaryMoreThan(Double salary);
	
}
