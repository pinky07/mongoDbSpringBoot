package informatech.intellicentrics.com.repository;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import informatech.intellicentrics.com.document.Product;
public interface ProductRepository extends CrudRepository<Product, String> {
	 @Override
    Optional<Product> findById(String id);

    @Override
    void delete(Product deleted);
}
