package uz.pdp.appwerhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.appwerhousedemo.payload.ProductDto;
import uz.pdp.appwerhousedemo.payload.Result;
import uz.pdp.appwerhousedemo.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductService productService;

    public Result addProduct(@RequestBody ProductDto productDto){
        return productService.addProduct(productDto);
    }
}
