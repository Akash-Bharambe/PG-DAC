package com.app.entities;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable //mandatory : to specify composite value type
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AdhaarCard {
	@Column(name="card_number",length = 12,unique = true)
	private String cardNumber;
	@Column(length = 30)
	private String location;
	@Column(name="created_on")
	private LocalDate createdOn;
		
}
