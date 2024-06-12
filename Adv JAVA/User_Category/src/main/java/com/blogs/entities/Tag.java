package com.blogs.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tags")
public class Tag extends BaseEntity {
	@Column(length = 20, unique = true)
	private String name;
	//Tags *--->* Posts (many many , uni dir)
	/*
	 * to improve the performance , use collection type as Set , instead 
	 * of List
	 */
	@ManyToMany//mandatory o.w Mapping exc
	//optional anno to specify name of the link table , name of FK cols
	@JoinTable(name="tag_posts",
	joinColumns = @JoinColumn(name="tag_id"),
	inverseJoinColumns = @JoinColumn(name="post_id")
	)	
	private Set<BlogPost> posts=new HashSet<>();

	public Tag() {
		// TODO Auto-generated constructor stub
	}

	public Tag(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	public Set<BlogPost> getPosts() {
		return posts;
	}

	public void setPosts(Set<BlogPost> posts) {
		this.posts = posts;
	}

	@Override
	public String toString() {
		return "Tag [name=" + name + "]";
	}

}
