package com.newton.grocery.service;

import com.newton.grocery.entity.NameEnum;
import com.newton.grocery.entity.Vegetable;
import com.newton.grocery.repository.VegetableRepository;
import org.springframework.stereotype.Service;

@Service
public class VegetableService {
    private final VegetableRepository vegetableRepository;

    public VegetableService(VegetableRepository vegetableRepository) {
        this.vegetableRepository = vegetableRepository;
    }

    public Vegetable addVegetable(NameEnum name, Double currentNitrates) {
        Vegetable vegetable = new Vegetable();
        vegetable.setVegetableName(name);
        vegetable.setCurrentNitrates(currentNitrates);
        setVegetableStandardNitrates(name, vegetable);
        return vegetableRepository.save(vegetable);
    }

    private void setVegetableStandardNitrates(NameEnum name, Vegetable vegetable) {
        if (name.equals(NameEnum.CARROT)){
            vegetable.setStandardNitrates(150D);
        } else if (name.equals(NameEnum.POTATO)) {
            vegetable.setStandardNitrates(120D);
        } else if (name.equals(NameEnum.LETTUCE)) {
            vegetable.setStandardNitrates(170D);
        }else {
            vegetable.setStandardNitrates(50D);
        }
    }
}
