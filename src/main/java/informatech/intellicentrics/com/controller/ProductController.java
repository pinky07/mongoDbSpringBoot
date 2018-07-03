package informatech.intellicentrics.com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import informatech.intellicentrics.com.document.Product;
import informatech.intellicentrics.com.repository.ProductRepository;

@RestController
public class ProductController {
		@Autowired
	    ProductRepository productRepository;
		
		
		 @RequestMapping(method=RequestMethod.GET, value="/products")
		public Iterable<Product> product() {
	        return productRepository.findAll();
	    }

		 @RequestMapping(method=RequestMethod.POST, value="/products")
		 public String save(@RequestBody Product product) {
		        productRepository.save(product);

		        return product.getId();
		    }
		 
		 @RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
		 public Product update(@PathVariable String id, @RequestBody Product product) {
			 Optional<Product> prod = productRepository.findById(id);
			 if(prod.isPresent()){
				Product produc= prod.get();
				 if(product.getProdName() != null)
					 produc.setProdName(product.getProdName());
			        if(product.getProdDesc() != null)
			        	produc.setProdDesc(product.getProdDesc());
			        if(product.getProdPrice() != null)
			        	produc.setProdPrice(product.getProdPrice());
			        if(product.getProdImage() != null)
			        	produc.setProdImage(product.getProdImage());
			        productRepository.save(produc);
			       
			 }
			return product;
					
		 }
		 @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
		    public String delete(@PathVariable String id) {
			 Optional<Product> prod  = productRepository.findById(id);
			 if(prod.isPresent()){ 
				 Product produc= prod.get();
				  productRepository.delete(produc);
			 }
		      

		        return "product deleted";
		    }
}
