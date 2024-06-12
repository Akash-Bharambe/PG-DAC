package com.products.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Setter @Getter @NoArgsConstructor @ToString
@Table(name = "categories")
public class Category {
	
	@Column(name = "category_name", length = 20)
	private String name;
	
	@Column(name = "description",length = 100)
	private String description;
	
	@OneToMany(mappedBy = "category")
	private List<Product> products = new ArrayList<Product>(); 

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}
	
	
}
