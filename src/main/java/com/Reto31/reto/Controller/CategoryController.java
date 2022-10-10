package com.Reto31.reto.Controller;

import com.Reto31.reto.Model.Category;
import com.Reto31.reto.Service.CategoryService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Category")
@CrossOrigin(origins="*",methods ={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class CategoryController {
   
    @Autowired
    private CategoryService categoryService;
    
    @GetMapping("/all")
    public List <Category> getCategoryAll(){
        return categoryService.getCategoryAll();  
    }
    @GetMapping("/id")
    public Optional<Category> getCategoryId(@PathVariable("id")Integer identificador){
        return categoryService.getCategoryId(identificador);
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category saveCategory(@RequestBody Category category){
      return categoryService.saveCategory(category);
    }
}