package yb.github.moorish.service.impl;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import yb.github.moorish.model.Bag;
import yb.github.moorish.model.Sale;
import yb.github.moorish.repository.BagRepository;
import yb.github.moorish.repository.SaleRepository;
import yb.github.moorish.service.SaleService;

public class DefaultSaleService implements SaleService{
	
	@Inject
	private BagRepository bagRepo;
	
	@Inject
	private SaleRepository saleRepo;


	public List<Sale> getAllSales() {
		return saleRepo.findAll();
	}

	public List<Bag> getAllBags() {
		return bagRepo.findAll();
	}

	public Optional<Sale> getSale(Long id) {
		return Optional.ofNullable(saleRepo.getOne(id));
	}

	public Optional<Bag> getBag(Long id) {
		return Optional.ofNullable(bagRepo.getOne(id));
	}

	@Transactional
	public boolean addOrUpdateSale(Sale sale) {
		return saleRepo.save(sale) != null;
	}

	@Transactional
	public boolean addOrUpdateBag(Bag bag) {
		return bagRepo.save(bag) != null;
	}

	@Transactional
	public void deleteSale(Long id) {
		try {
			saleRepo.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	@Transactional
	public void deleteBag(Long id) {
		try {
			bagRepo.deleteById(id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}		
	}

}
