package informatech.intellicentrics.com.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection="company")
public class Company {
	@Id
	private int id;
    private String name;
    private List<Product_Company> product_company;
    private Contact contact;
	public Contact getContact() {
		return contact;
	}
	public void setContact(Contact contact) {
		this.contact = contact;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Product_Company> getProduct_company() {
		return product_company;
	}
	public Company(int id, String name, List<Product_Company> product_company, Contact contact) {
		super();
		this.id = id;
		this.name = name;
		this.product_company = product_company;
		this.contact = contact;
	}
	public void setProduct_company(List<Product_Company> product_company) {
		this.product_company = product_company;
	}
	
}
