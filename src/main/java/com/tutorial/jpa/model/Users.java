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
@Table(name = "USERS_TABLE")
public class Users {

    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "USERS_SEQ")
//    @SequenceGenerator(name = "USERS_SEQ", sequenceName = "USERS_SEQ",allocationSize = 1, initialValue = 1)

//    @GeneratedValue(strategy = GenerationType.TABLE ,generator = "USERS_ID_GEN")
//    @TableGenerator(name="USERS_ID_GEN", table = "ID_GEN", pkColumnName = "ID_NAME", valueColumnName = "ID_VAL", allocationSize = 1)
    @GeneratedValue
    private Long id;

    @Column(name = "USERNAME")
    private String username;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @Column(insertable = false)
    private LocalDateTime modifiedAt;
}
