package com.blogs.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
public class BlogPost extends BaseEntity {
	@Column(length = 60, unique = true)
	private String title;
	@Column(length = 500)
	private String content;
	@Column(length = 100)
	private String description;
	// many -> one association, BlogPost * -> Category
	@ManyToOne // mandatory , o.w MappingExc
	@JoinColumn(name = "category_id", nullable = false)
	private Category chosenCategory;
	// uni dir asso BlogPost * ----> 1User
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "author_id", nullable = false)
	private User blogger;

	public BlogPost() {
		// TODO Auto-generated constructor stub
	}

	public BlogPost(String title, String content, String description) {
		super();
		this.title = title;
		this.content = content;
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getChosenCategory() {
		return chosenCategory;
	}

	public void setChosenCategory(Category chosenCategory) {
		this.chosenCategory = chosenCategory;
	}

	public User getBlogger() {
		return blogger;
	}

	public void setBlogger(User blogger) {
		this.blogger = blogger;
	}

	@Override
	public String toString() {
		return "BlogPost [title=" + title + ", content=" + content + ", description=" + description + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BlogPost other = (BlogPost) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}
	
	

}
