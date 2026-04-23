package kg.mederbekov.comp_service.controller;

import kg.mederbekov.comp_service.model.dto.ModelSpeedHdDto;
import kg.mederbekov.comp_service.service.PcService;
import kg.mederbekov.comp_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private ProductService productService;
    @Autowired
    private PcService pcService;


    @GetMapping("/1")
    public ResponseEntity<?> findModelHdDtoByPrice(@RequestParam double price){
        List<ModelSpeedHdDto> modelSpeedHdDtos = pcService.findModelSpeedHdDtosByPrice(price);
        return ResponseEntity.ok(modelSpeedHdDtos);
    }
    @GetMapping("/2")
    public ResponseEntity<?> task2(@RequestParam String type){
        List<String> makers = productService.findMakersByType(type);
        return ResponseEntity.ok(makers);
    }

}
