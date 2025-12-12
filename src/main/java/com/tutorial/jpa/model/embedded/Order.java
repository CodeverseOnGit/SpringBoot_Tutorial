package com.tutorial.jpa.model.embedded;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "_order")
public class Order {

    @EmbeddedId
    private OrderId id;
    private String orderInfo;
}
