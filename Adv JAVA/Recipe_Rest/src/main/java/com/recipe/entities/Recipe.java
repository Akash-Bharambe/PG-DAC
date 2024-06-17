package com.recipe.entities;

import java.time.LocalDate;

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

import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "recipe")
public class Recipe 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recipeId;
	@Column(length = 20)
	private String title;
	@Column(length = 200)
	private String description;
	@Column(length = 200)
	private String ingredients;
	@Column(length = 200)
	private String instructions;
	@Enumerated(EnumType.STRING)
	@Column
	private DifficultyLevel difficultiLevel;
	@Enumerated(EnumType.STRING)
	@Column
	private CuisineType cuisineType;
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;
	@Column
	
	@CreationTimestamp
	private LocalDate creationDate;
	
}
