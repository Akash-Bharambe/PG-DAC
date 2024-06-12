package com.app.DAO;

import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.entities.Appointment;
import com.app.entities.Doctor;
import com.app.entities.Patient;
import com.app.utils.HibernateUtils;

public class AppointmentDAOImpl implements AppointmentDAO {

	@Override
	public void addAppointments(Long patientId, Long doctorId, LocalDateTime time) {
		Session session = HibernateUtils.getFactory().getCurrentSession();
		
		Transaction transaction = session.beginTransaction();
		
		try {
			Doctor doctor = session.get(Doctor.class, doctorId);
			Patient patient = session.get(Patient.class, patientId);
			
			Appointment appointment = new Appointment();
			appointment.setDoctor(doctor);
			appointment.setPatient(patient);
			appointment.setAppointmentTime(time);
			
			session.persist(appointment);
			transaction.commit();
			System.out.println("Added Succeddfully...!!!");
		} catch (Exception e) {
			System.out.println("failed to add...!!!");
			transaction.rollback();
			throw e;
		}
		
		

	}

}
