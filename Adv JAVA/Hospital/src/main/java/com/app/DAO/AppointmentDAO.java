package com.app.DAO;

import java.time.LocalDateTime;

public interface AppointmentDAO {
	public void addAppointments(Long patientId, Long doctorId, LocalDateTime time);
}
