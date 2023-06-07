package uz.pdp.appwerhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.appwerhouse.entity.Category;
import uz.pdp.appwerhouse.payload.CategoryDto;
import uz.pdp.appwerhouse.payload.Result;
import uz.pdp.appwerhouse.repository.CategoryRepository;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryRepository categoryRepository;

    public Result addCategory(CategoryDto dto) {

        Category category = new Category();
        category.setName(dto.getName());

        if (dto.getParentCategoryId() != null) {
            Optional<Category> categoryParentRepositoryById = categoryRepository.findById(dto.getParentCategoryId());
            if (!categoryParentRepositoryById.isPresent())
                return new Result("Bunday Parent Category yoq", false);

            category.setParentCategory(categoryParentRepositoryById.get());
        }
        categoryRepository.save(category);
        return new Result("Muvaffaqiyatli salandi!", true);
    }
}
