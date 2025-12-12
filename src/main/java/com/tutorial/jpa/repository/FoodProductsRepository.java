package com.tutorial.jpa.repository;

import com.tutorial.jpa.model.FoodProducts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodProductsRepository extends JpaRepository<FoodProducts,Long> {
}
