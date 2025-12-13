package com.tutorial.jpa;

import com.github.javafaker.Faker;
import com.tutorial.jpa.model.FoodProducts;
import com.tutorial.jpa.model.Users;
import com.tutorial.jpa.repository.FoodProductsRepository;
import com.tutorial.jpa.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaApplication.class, args);
	}

    public CommandLineRunner commandLineRunner (UserRepository userRepository, FoodProductsRepository foodProductsRepository) {
        return args -> {
//            for(int i = 0; i<10; i++) {
//                Faker faker = new Faker();
//                var user = Users.builder()
//                        .username(faker.name().username())
//                        .email("test"+i+"@test.com")
//                        .createdAt(java.time.LocalDateTime.now())
//                        .build();
//                userRepository.save(user);
//            }
            var food = FoodProducts.builder()
                    .name("Cheesecake")
                    .price(324.2)
                    .expirationDate("2024-12-31")
                    .build();
//            foodProductsRepository.save(food);
//            foodProductsRepository.updateFoodProduct(1,"1999-12-31");
            foodProductsRepository.findByIngredients("Sugar");
        };
    }
}
