package com.core;

/**
 * Category enum of Shoes
 */
public enum CategoryType {
	MENS_RUNNING_SHOES, MENS_WALKING_SHOES, MENS_SNEAKERS, WOMENS_RUNNING_SHOES, WOMENS_WALKING_SHOES, WOMENS_SNEAKERS;

	@Override
	public String toString() {
		return this.name();
	}
}
