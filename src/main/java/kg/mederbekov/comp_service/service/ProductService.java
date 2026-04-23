package kg.mederbekov.comp_service.service;

import java.util.List;

public interface ProductService {

    List<String> findMakersByType(String type);
}
