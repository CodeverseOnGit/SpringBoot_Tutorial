package com.tutorial.jpa;

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

    @Bean
    public CommandLineRunner commandLineRunner (UserRepository userRepository, FoodProductsRepository foodProductsRepository) {
        return args -> {
//            var user = Users.builder()
//                    .username("test")
//                    .email("test@test.com")
//                    .createdAt(java.time.LocalDateTime.now())
//                    .build();
//            userRepository.save(user);
            var food = FoodProducts.builder()
                    .name("Cheesecake")
                    .price(324.2)
                    .build();
            foodProductsRepository.save(food);
        };
    }
}
