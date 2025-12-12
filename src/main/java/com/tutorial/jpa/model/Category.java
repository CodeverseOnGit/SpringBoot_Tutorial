package com.tutorial.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@SuperBuilder
public class Category extends BaseEntity{

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
