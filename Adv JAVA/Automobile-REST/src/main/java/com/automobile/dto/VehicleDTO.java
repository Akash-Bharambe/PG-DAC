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

	@NotBlank(message = "Vehicle Name cannot be empty")
	private String vehicleName;

	@NotNull(message = "Company cannot be empty")
	private Company company;

	@NotBlank(message = "Vehicle Number cannot be empty")
	private String vehicleNumber;

	@NotNull(message = "Vehicle Type cannot be empty")
	private VehicleType vehicleType;

	@NotNull(message = "User cannot be empty")
	private UserDTO user;
}
