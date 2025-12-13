package com.tutorial.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import lombok.*;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
@DiscriminatorValue("FOOD")
@NamedQuery(name = "FoodProducts.findByIngredients", query = "SELECT fp FROM FoodProducts fp WHERE fp.ingredients = :ingredients")
public class FoodProducts extends Product {
    private String expirationDate;
    private String ingredients;
    private boolean isPerishable;
}
