package com.newton.grocery.controller;

import com.newton.grocery.dto.AddVegetableRequest;
import com.newton.grocery.service.VegetableService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vegetable")
public class VegetableController {
    private final VegetableService vegetableService;

    public VegetableController(VegetableService vegetableService) {
        this.vegetableService = vegetableService;
    }

    @PostMapping("/add")
    public ResponseEntity<?> addVegetable(@RequestBody AddVegetableRequest request) {
        return ResponseEntity.ok(vegetableService.addVegetable(request.name(), request.currentNitrates()));
    }
}
