package com.tutorial.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private Long userId;

    private LocalDateTime createdAt;
}
