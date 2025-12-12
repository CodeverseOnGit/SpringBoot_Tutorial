package com.tutorial.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    private Long orderId;

    private Long productId;

    private Integer quantity;
}
