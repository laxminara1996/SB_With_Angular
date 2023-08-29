package in.laxmi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.laxmi.entity.Product;
import in.laxmi.repository.ProductRepo;
@CrossOrigin(origins = "http://localhost:4200")
@RestController("/")
public class ProductController {
    @Autowired
	private ProductRepo repo;
	
	@GetMapping("msg")
	public ResponseEntity<Message> getMessage() {
		return new ResponseEntity<Message>(new Message("Spring-with-angular"),HttpStatus.OK);
	}
	@GetMapping("products")
	public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = this.repo.findAll();
		System.out.println("======="+list);
		return new ResponseEntity<List<Product>>(list,HttpStatus.OK);
	}
	
}
