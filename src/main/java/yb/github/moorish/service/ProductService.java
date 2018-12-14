package yb.github.moorish.service;

import java.util.List;
import java.util.Optional;

import yb.github.moorish.model.Product;
import yb.github.moorish.model.Reference;

public interface ProductService {

	List<Product> getAllProducts();

	List<Reference> getAllReferences();

	Optional<Product> getProduct(Long id);

	Optional<Reference> getReference(Long id);

	boolean addOrUpdateProduct(Product product);

	boolean addOrUpdateReference(Reference reference);

	void deleteProduct(Long id);

	void deleteReference(Long id);

}
