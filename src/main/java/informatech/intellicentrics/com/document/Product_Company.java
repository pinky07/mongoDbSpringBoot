package informatech.intellicentrics.com.document;

public class Product_Company {
	private String code;
	private String name;
	private String details;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDetails() {
		return details;
	}
	public Product_Company(String code, String name, String details) {
		super();
		this.code = code;
		this.name = name;
		this.details = details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
}
