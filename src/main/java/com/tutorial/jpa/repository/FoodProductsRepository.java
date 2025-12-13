package com.tutorial.jpa.repository;

import com.tutorial.jpa.model.FoodProducts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface FoodProductsRepository extends JpaRepository<FoodProducts,Long> {

    List<FoodProducts> findByIngredients(@Param("ingredients") String ingredients);

    @Modifying
    @Transactional
    @Query("UPDATE FoodProducts fp set fp.expirationDate = :expirationDate where fp.id = :id")
    void updateFoodProduct(int id, String expirationDate);
}
