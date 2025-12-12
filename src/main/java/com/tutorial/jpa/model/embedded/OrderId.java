package com.tutorial.jpa.model.embedded;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class OrderId implements Serializable {
    private String username;
    private LocalDateTime orderDate;
}
