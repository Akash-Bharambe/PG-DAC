package com.blogs.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="categories")
public class Category extends BaseEntity {
	@Column(length = 50, unique = true)
	private String name;
	@Column(length = 200)
	private String description;
	// Category 1 ----> * BlogPost (one --> Many)
	// Tip - always init the Collection ref ->  EMPTY collection 
	//(to avoid NPExc)
	@OneToMany(mappedBy = "chosenCategory",
			cascade = CascadeType.ALL,orphanRemoval = true
	/* ,fetch = FetchType.EAGER */)
	/*
	 * mandatory to add mappedBy - in bi dir asso.
	 * value = name of the asso prop as it appears in the owning side.
	 */
	private List<BlogPost> posts = new ArrayList<>();

	public Category() {
		// TODO Auto-generated constructor stub
	}

	public Category(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

	public List<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(List<BlogPost> posts) {
		this.posts = posts;
	}
//Tip - Never add any associtation based props in toString (to avoid infinite  recursion)
	@Override
	public String toString() {
		return "Category ID " + getId() + "  [name=" + name + ", description=" + description + "]";
	}
	//helper methods - to add/remove a blog post
	public void addBlogPost(BlogPost post)
	{
		posts.add(post);//category --> posts
		post.setChosenCategory(this); //posts --> catgeory
	}
	public void removeBlogPost(BlogPost post)
	{
		posts.remove(post);
		post.setChosenCategory(null);
	}

}
