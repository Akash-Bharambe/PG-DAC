package com.products.entities;


import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @NoArgsConstructor @ToString
@Table(name="products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Long productId;
	
	@Column(name="product_name", length = 20)
	private String name;
	
	@CreationTimestamp
	@Column(name = "creation_ts")
	private LocalDateTime creationDateTime;
	
	@UpdateTimestamp
	@Column(name = "updated_ts")
	private LocalDateTime updateDateTime;
	
	@Column(name = "price")
	private double price;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private Category category;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
}
