package yb.github.moorish.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yb.github.moorish.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
