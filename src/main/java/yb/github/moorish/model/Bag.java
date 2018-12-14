package yb.github.moorish.model;

import java.util.Hashtable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Bag {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@OneToOne
	private User user;

	// product with the choosed quantity
	@OneToMany
	private Hashtable<Product, Long> products;

	public Bag() {
		// TODO Auto-generated constructor stub
	}



}
