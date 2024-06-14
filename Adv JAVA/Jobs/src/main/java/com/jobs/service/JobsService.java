package com.jobs.service;

import java.util.List;

import com.jobs.entities.Job;

public interface JobsService {

	List<Job> getAllJobs();

	Job getJob(Long id);

	Job addJob(Job job);

	String updateJob(Long id, Job job);

	String deleteJob(Long id);
	
}
