package com.products.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity @Setter @Getter @NoArgsConstructor @ToString
@Table(name = "categories")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "category_name", length = 20)
	private String name;
	
	@Column(name = "description",length = 100)
	private String description;
	
//	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
//	private List<Product> products = new ArrayList<Product>(); 

//	public Category(String name, String description) {
//		super();
//		this.name = name;
//		this.description = description;
//	}
	
	
}
