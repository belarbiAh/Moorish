package yb.github.moorish.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import yb.github.moorish.model.enums.Category;

@Entity
public class Reference {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String ref;

	private String name;

	private Double price;

	private String gender;

	private Category category;

	private String subCategory;

	public Reference() {
		// TODO Auto-generated constructor stub
	}

	public Reference(Long id, String ref, String name, Double price, String gender, Category category,
			String subCategory) {
		super();
		this.id = id;
		this.ref = ref;
		this.name = name;
		this.price = price;
		this.gender = gender;
		this.category = category;
		this.subCategory = subCategory;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRef() {
		return ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
