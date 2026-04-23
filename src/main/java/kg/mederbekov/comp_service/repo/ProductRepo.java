package kg.mederbekov.comp_service.repo;

import kg.mederbekov.comp_service.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepo extends JpaRepository<Product, String> {

    List<Product> findByTypeEqualsIgnoreCase(String type);
}
