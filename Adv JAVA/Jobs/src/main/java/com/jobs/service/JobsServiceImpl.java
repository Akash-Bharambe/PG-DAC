package com.jobs.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobs.DTO.JobDTO;
import com.jobs.entities.Job;
import com.jobs.exception.JobsException;
import com.jobs.repository.JobsRepository;

@Service
@Transactional
public class JobsServiceImpl implements JobsService {

	@Autowired
	private JobsRepository repository;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public List<JobDTO> getAllJobs() {
//		List<JobDTO> jobDTOs = new ArrayList<JobDTO>();
//		repository.findAll().stream().forEach(entity-> jobDTOs.add(mapper.map(entity, JobDTO.class)));
//		return jobDTOs;
		return repository.findAll().stream().map(entity-> mapper.map(entity, JobDTO.class)).collect(Collectors.toList());
	}

	@Override
	public JobDTO getJob(Long id) {
		return mapper.map(repository.findById(id).orElseThrow(() -> new JobsException("Job with " + id + " not Found")), JobDTO.class);
	}

	@Override
	public JobDTO addJob(JobDTO jobDTO) {
		return mapper.map(repository.save(mapper.map(jobDTO, Job.class)), JobDTO.class);
	}

	@Override
	public String updateJob(Long id, JobDTO jobDTO) {
		String msgString = "Not found";
		if (repository.existsById(id)) {
			Job job = mapper.map(jobDTO, Job.class);
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
	
	@Override
	public List<JobDTO> getBySalaryMoreThan(Double salary) {
		List<Job> moreThan = repository.getJobsHavingSalaryMoreThan(salary);
		return moreThan.stream().map(entity-> mapper.map(entity, JobDTO.class)).collect(Collectors.toList());
	}

}
