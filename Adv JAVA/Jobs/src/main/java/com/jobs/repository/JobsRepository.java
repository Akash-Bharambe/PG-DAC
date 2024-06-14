package com.jobs.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jobs.entities.Job;

public interface JobsRepository extends JpaRepository<Job, Long> {

}
