package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhousedemo.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
