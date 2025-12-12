package com.tutorial.jpa.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
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
@DiscriminatorValue("WASHROOM")
public class WashroomProducts extends Product {
    private String purpose;
}
