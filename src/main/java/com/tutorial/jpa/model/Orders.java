package com.tutorial.jpa.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
public class Orders extends BaseEntity{

    private LocalDateTime createdAt;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "users_id")
    private Users users;

    @OneToMany(mappedBy = "order",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    @ManyToMany
    @JoinTable(
            name = "orders_products",
            joinColumns = {@JoinColumn (name = "orders_id")},
            inverseJoinColumns = {@JoinColumn (name = "product_id")}
    )
    private List<Product> products;
}
