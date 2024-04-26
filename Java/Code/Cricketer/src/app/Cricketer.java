package app;

public class Cricketer {
	
	private String name;
	private int age;
	private String email_id;
	private String phone;
	private int rating;
	
	public Cricketer(String name) {
		super();
		this.name = name;
	}
	public Cricketer(String name, int age, String email_id, String phone, int rating) {
		super();
		this.name = name;
		this.age = age;
		this.email_id = email_id;
		this.phone = phone;
		this.rating = rating;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Cricketer [name=" + name + ", age=" + age + ", email_id=" + email_id + ", phone=" + phone + ", rating="
				+ rating + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Cricketer c = null;
		if (obj instanceof Cricketer)
			c = (Cricketer) obj;
		return this.name.equals(c.name);
	}
	
	
}
