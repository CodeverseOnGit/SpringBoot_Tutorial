package com.tutorial.jpa.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
public class Users {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USERS_SEQ")
//    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ",allocationSize = 1, initialValue = 1)

//    @GeneratedValue(strategy = GenerationType.TABLE ,generator = "USERS_ID_GEN")
//    @TableGenerator(name="USERS_ID_GEN", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 1)
    @GeneratedValue
    private Long id;

    private String username;

    private String email;

    private LocalDateTime createdAt;
}
