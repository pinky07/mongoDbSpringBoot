package informatech.intellicentrics.com.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import informatech.intellicentrics.com.document.Company;
import informatech.intellicentrics.com.document.Product;
import informatech.intellicentrics.com.repository.CompanyRepository;
import informatech.intellicentrics.com.repository.ProductRepository;

@RestController
public class CompanyController {
		@Autowired
	    CompanyRepository companyRepository;
		
		
		 @RequestMapping(method=RequestMethod.GET, value="/companys")
		public Iterable<Company> company() {
	        return companyRepository.findAll();
	    }

		 @RequestMapping(method=RequestMethod.POST, value="/companys")
		 public String save(@RequestBody Company companys) {
			 companyRepository.save(companys);

		        return companys.getName();
		    }
		 
//		 @RequestMapping(method=RequestMethod.PUT, value="/products/{id}")
//		 public Product update(@PathVariable String id, @RequestBody Company companys) {
//			 Optional<Company> prod = companyRepository.findById(id);
//			 if(prod.isPresent()){
//				Product produc= prod.get();
//				 if(product.getProdName() != null)
//					 produc.setProdName(product.getProdName());
//			        if(product.getProdDesc() != null)
//			        	produc.setProdDesc(product.getProdDesc());
//			        if(product.getProdPrice() != null)
//			        	produc.setProdPrice(product.getProdPrice());
//			        if(product.getProdImage() != null)
//			        	produc.setProdImage(product.getProdImage());
//			        companyRepository.save(produc);
//			       
//			 }
//			return product;
			
			
			
		 }
//		 @RequestMapping(method=RequestMethod.DELETE, value="/products/{id}")
//		    public String delete(@PathVariable String id) {
//			 Optional<Product> prod  = productRepository.findById(id);
//			 if(prod.isPresent()){ 
//				 Product produc= prod.get();
//				  productRepository.delete(produc);
//			 }
//		      
//
//		        return "product deleted";
//		    }
//}
