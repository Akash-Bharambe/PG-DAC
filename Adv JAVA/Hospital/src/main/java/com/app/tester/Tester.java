package com.app.tester;

import java.time.LocalDateTime;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.app.DAO.AppointmentDAO;
import com.app.DAO.AppointmentDAOImpl;
import com.app.entities.Appointment;
import com.app.utils.HibernateUtils;

public class Tester {

	public static void main(String[] args) {
		try (SessionFactory factory = HibernateUtils.getFactory()) {
			System.out.println("Hibernate Running...");
			
			AppointmentDAO appointmentDAO = new AppointmentDAOImpl();
			appointmentDAO.addAppointments(1l, 3l, LocalDateTime.now());
		} catch (HibernateException e) {
			e.printStackTrace();
		};
	}

}
