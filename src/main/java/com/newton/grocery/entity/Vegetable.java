package com.newton.grocery.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "vegetable")
public class Vegetable {
    @Id
    @SequenceGenerator(name = "vegetable_id_sequence", sequenceName = "vegetable_id_sequence", allocationSize = 1)
    @GeneratedValue(generator = "vegetable_id_sequence", strategy = GenerationType.SEQUENCE)
    private Long vegetableId;
    @Enumerated(value = EnumType.STRING)
    private NameEnum vegetableName;
    private Double currentNitrates;
    private Double standardNitrates;
    private Double postWaterNitrates;
    private Boolean isHealthy;

    public Vegetable() {
    }

    public Long getVegetableId() {
        return vegetableId;
    }

    public void setVegetableId(Long vegetableId) {
        this.vegetableId = vegetableId;
    }

    public NameEnum getVegetableName() {
        return vegetableName;
    }

    public void setVegetableName(NameEnum vegetableName) {
        this.vegetableName = vegetableName;
    }

    public Double getCurrentNitrates() {
        return currentNitrates;
    }

    public void setCurrentNitrates(Double currentNitrates) {
        this.currentNitrates = currentNitrates;
    }

    public Double getStandardNitrates() {
        return standardNitrates;
    }

    public void setStandardNitrates(Double standardNitrates) {
        this.standardNitrates = standardNitrates;
    }

    public Double getPostWaterNitrates() {
        return postWaterNitrates;
    }

    public void setPostWaterNitrates(Double postWaterNitrates) {
        this.postWaterNitrates = postWaterNitrates;
    }

    public Boolean getHealthy() {
        return isHealthy;
    }

    public void setHealthy(Boolean healthy) {
        isHealthy = healthy;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "vegetableId=" + vegetableId +
                ", vegetableName=" + vegetableName +
                ", currentNitrates=" + currentNitrates +
                ", standardNitrates=" + standardNitrates +
                ", postWaterNitrates=" + postWaterNitrates +
                ", isHealthy=" + isHealthy +
                '}';
    }
}
