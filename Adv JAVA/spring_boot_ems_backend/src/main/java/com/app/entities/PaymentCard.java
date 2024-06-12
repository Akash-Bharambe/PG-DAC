package com.app.entities;

import java.time.LocalDate;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PaymentCard {
	@Column(name="card_type",length = 20)
	private String cardType;
	@Column(name="exp_date")
	private LocalDate expDate;
	@Column(length = 10)
	private String cvv;		
}
