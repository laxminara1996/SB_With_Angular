package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{

}
