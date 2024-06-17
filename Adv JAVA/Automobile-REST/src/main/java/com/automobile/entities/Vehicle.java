package com.automobile.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "vehicles")
@NoArgsConstructor
@ToString
public class Vehicle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "vehicle_id")
	private Long vehicleId;

	@Column(name = "vehicle_name", length = 20)
	private String vehicleName;

	@Enumerated(EnumType.STRING)
	private Company company;

	@Column(name = "vehicle_number", length = 20)
	private String vehicleNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "vehicle_type")
	private VehicleType vehicleType;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
}
