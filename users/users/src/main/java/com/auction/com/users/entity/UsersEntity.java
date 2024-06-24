package com.auction.com.users.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class UsersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long UserId;

    @NotBlank
    private String UserName;

    @NotBlank
    private String Email;

    @org.hibernate.validator.constraints.NotBlank
    private String Address;

    @NotBlank
    private String PhoneNumber;
}
