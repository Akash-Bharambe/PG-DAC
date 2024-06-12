package com.blogs.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@MappedSuperclass // to tell JPA/Hiberanate -no table creation , it's common base class to inherit
					// other entities
public class BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@CreationTimestamp //to auto generate creation date
	@Column(name="creation_date")
	private LocalDate creationDate;
	@UpdateTimestamp //to auto generate updation datetime(TS)
	@Column(name="updation_ts")
	private LocalDateTime updationTimeStamp;

	public BaseEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public LocalDateTime getUpdationTimeStamp() {
		return updationTimeStamp;
	}

	public void setUpdationTimeStamp(LocalDateTime updationTimeStamp) {
		this.updationTimeStamp = updationTimeStamp;
	}

	@Override
	public String toString() {
		return "BaseEntity [id=" + id + ", creationDate=" + creationDate + ", updationTimeStamp=" + updationTimeStamp
				+ "]";
	}

}
