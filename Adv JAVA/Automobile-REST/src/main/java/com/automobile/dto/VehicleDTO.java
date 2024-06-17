package com.automobile.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.automobile.entities.Company;
import com.automobile.entities.VehicleType;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class VehicleDTO {

	@NotBlank
	private String vehicleName;

	@NotNull
	private Company company;

	@NotBlank
	private String vehicleNumber;

	@NotNull
	private VehicleType vehicleType;

	@NotNull
	private UserDTO user;
}
