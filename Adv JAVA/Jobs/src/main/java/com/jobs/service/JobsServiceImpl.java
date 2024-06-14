package com.jobs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobs.entities.Job;
import com.jobs.exception.JobsException;
import com.jobs.repository.JobsRepository;

@Service
@Transactional
public class JobsServiceImpl implements JobsService {

	@Autowired
	private JobsRepository repository;

	@Override
	public List<Job> getAllJobs() {
		return repository.findAll();
	}

	@Override
	public Job getJob(Long id) {
		return repository.findById(id).orElseThrow(() -> new JobsException("Job with " + id + " not Found"));
	}

	@Override
	public Job addJob(Job job) {
		return repository.save(job);
	}

	@Override
	public String updateJob(Long id, Job job) {
		String msgString = "Not found";
		if (repository.existsById(id)) {
			job.setId(id);
			repository.save(job);
			msgString = "Updated Successfully";
			return msgString;
		}
		return msgString;
	}

	@Override
	public String deleteJob(Long id) {
		String msgString = "Not found";
		if (repository.existsById(id)) {
			repository.deleteById(id);
			msgString = "Deleted Successfully";
			return msgString;
		}
		return msgString;
	}

}
