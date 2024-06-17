package com.recipe.dto;

import javax.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter @NoArgsConstructor
public class UserDTO {
	@NotBlank(message = "Name can't be empty")
	private String name;
}
