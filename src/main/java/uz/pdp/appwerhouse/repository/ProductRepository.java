package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhousedemo.entity.Product;
import uz.pdp.appwerhousedemo.payload.ProductDto;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    boolean existsByNameAndCategoryId(String name, Integer category_id);
}
