package kg.mederbekov.comp_service.service.impl;

import kg.mederbekov.comp_service.model.Laptop;
import kg.mederbekov.comp_service.model.dto.ModelRamScreenDto;
import kg.mederbekov.comp_service.repo.LaptopRepo;
import kg.mederbekov.comp_service.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LaptopServiceImpl implements LaptopService {
    @Autowired
    private LaptopRepo laptopRepo;
    @Override
    public List<ModelRamScreenDto> findModelRamScreenDtosByPrice(double price) {

        List<Laptop> laptops = laptopRepo.findByPriceGreaterThan(price);
        return laptops
                .stream()
                .map(x-> ModelRamScreenDto
                        .builder()
                        .model(x.getProduct().getModel())
                        .ram(x.getRam())
                        .screen(x.getScreen())
                        .build())
                .toList();

    }
}
