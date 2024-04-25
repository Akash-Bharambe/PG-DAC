package com.app;

import java.time.LocalDate;

public class Task {
	private int taskId;
	private String taskName;
	private String description;
	private LocalDate taskDate;
	private StatusType status;
	private boolean active;
	

	public Task(int taskID, String taskName, String description, LocalDate date) {
		super();
		this.taskId = taskID;
		System.out.println(taskId);
		this.taskName = taskName;
		this.description = description;
		this.taskDate = date;
		this.status = StatusType.PENDING;
		this.active = true;
	}
	


	public int getTaskId() {
		return taskId;
	}

	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getTaskDate() {
		return taskDate;
	}

	public void setTaskDate(LocalDate taskDate) {
		this.taskDate = taskDate;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}


	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Task) {
			Task other = (Task) obj;
			return taskId == other.taskId;
		}
		return false;
	}

	@Override
	public String toString() {
		return "Task [taskId=" + taskId + ", taskName=" + taskName + ", description=" + description + ", taskDate="
				+ taskDate + ", status=" + status + ", active=" + active + "]";
	}

}
