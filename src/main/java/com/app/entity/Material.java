package com.app.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;
@Data
@Entity
public class Material {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Material name is required")
    private String materialName;

    @NotBlank(message = "Category is required")
    private String category;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    @NotBlank(message = "Unit is required")
    private String unit;

    @NotNull(message = "Available stock is required")
    @Min(value = 0, message = "Available stock cannot be negative")
    private Integer availableStock;
}
