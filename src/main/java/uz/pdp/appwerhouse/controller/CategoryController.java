package uz.pdp.appwerhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.appwerhousedemo.payload.CategoryDto;
import uz.pdp.appwerhousedemo.payload.Result;
import uz.pdp.appwerhousedemo.service.CategoryService;

@RestController
@RequestMapping("/controller")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @PostMapping
    public Result addCategory(@RequestBody CategoryDto dto){
        Result result = categoryService.addCategory(dto);
        return result;
    }
}
