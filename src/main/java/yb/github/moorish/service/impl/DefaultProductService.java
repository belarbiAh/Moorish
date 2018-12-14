package yb.github.moorish.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import yb.github.moorish.model.Product;
import yb.github.moorish.model.Reference;
import yb.github.moorish.repository.ProductRepository;
import yb.github.moorish.repository.ReferenceRepository;
import yb.github.moorish.service.ProductService;

public class DefaultProductService implements ProductService{
	
	@Inject
	private ReferenceRepository referenceRepo;
	
	@Inject
	private ProductRepository productRepo;
	

	public List<Product> getAllProducts() {
		return productRepo.findAll();
			
	}

	public List<Reference> getAllReferences() {
		return referenceRepo.findAll();
	}

	public Optional<Product> getProduct(Long id) {
		return Optional.ofNullable(productRepo.getOne(id));
	}

	public Optional<Reference> getReference(Long id) {
		return  Optional.ofNullable(referenceRepo.getOne(id));
	}

	@Transactional
	public boolean addOrUpdateProduct(Product product) {
		return productRepo.save(product) != null;
	}

	@Transactional
	public boolean addOrUpdateReference(Reference reference) {
		return referenceRepo.save(reference) != null;
	}

	@Transactional
	public void deleteProduct(Long id) {
		
		try {
			productRepo.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	@Transactional
	public void deleteReference(Long id) {
		try {
			referenceRepo.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
