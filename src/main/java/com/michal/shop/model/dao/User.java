package com.michal.shop.model.dao;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "User", indexes = {//TODO zweryfikowac
        @Index(name = "idx_email", columnList = "email", unique = true)
})
@Builder
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;


}
