package uz.pdp.appwerhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.appwerhousedemo.entity.Attachment;
import uz.pdp.appwerhousedemo.entity.Category;
import uz.pdp.appwerhousedemo.entity.Measurement;
import uz.pdp.appwerhousedemo.entity.Product;
import uz.pdp.appwerhousedemo.payload.ProductDto;
import uz.pdp.appwerhousedemo.payload.Result;
import uz.pdp.appwerhousedemo.repository.AttachmentRepository;
import uz.pdp.appwerhousedemo.repository.CategoryRepository;
import uz.pdp.appwerhousedemo.repository.MeasurementRepository;
import uz.pdp.appwerhousedemo.repository.ProductRepository;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Autowired
    AttachmentRepository attachmentRepository;

    @Autowired
    MeasurementRepository measurementRepository;

    public Result addProduct(ProductDto productDto){

        boolean existsByNameAndCategoryId = productRepository.existsByNameAndCategoryId(productDto.getName(), productDto.getCategoryId());
        if (!existsByNameAndCategoryId)
            return new Result("Bunday nomli kategoriya mavjud", false);

        Product product = new Product();
        product.setName(productDto.getName());
        product.setCode("1");
        Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
        if (!optionalCategory.isPresent())
            return new Result("Bunday category mavjud emas", false);

        product.setCategory(optionalCategory.get());

        Optional<Attachment> optionalAttachment = attachmentRepository.findById(productDto.getPhotoId());
        if (!optionalAttachment.isPresent())
            return new Result("Bunday photo mavjud emas", false);

        product.setPhoto(optionalAttachment.get());

        Optional<Measurement> optionalMeasurement = measurementRepository.findById(productDto.getMeasurementId());
        if (!optionalAttachment.isPresent())
            return new Result("Bunday measurement mavjud emas", false);

        product.setMeasurement(optionalMeasurement.get());

        productRepository.save(product);
        return new Result("Muvaffaqiyatli saqlandi!", true);

    }
}
