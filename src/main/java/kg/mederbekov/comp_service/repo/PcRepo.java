package kg.mederbekov.comp_service.repo;

import kg.mederbekov.comp_service.model.Pc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PcRepo extends JpaRepository<Pc,Integer> {
    List<Pc> findByPriceLessThan(double price);

}
