package com.newton.grocery.dto;

import com.newton.grocery.entity.NameEnum;

public record AddVegetableRequest(NameEnum name, Double currentNitrates) {
}
