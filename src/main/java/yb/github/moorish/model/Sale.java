package yb.github.moorish.model;

import java.util.Hashtable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private User user;

	//product with the choosed quantity
	@OneToMany
	private Hashtable<Product, Long> product;

	private Double totalAmount;

	private Boolean isDelivred;

	public Sale() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Hashtable<Product, Long> getProduct() {
		return product;
	}

	public void setProduct(Hashtable<Product, Long> product) {
		this.product = product;
	}

	public Double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Boolean getIsDelivred() {
		return isDelivred;
	}

	public void setIsDelivred(Boolean isDelivred) {
		this.isDelivred = isDelivred;
	}

	
	

}
