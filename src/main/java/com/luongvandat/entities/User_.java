package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class User_ {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String userId;
    private String userName;
    private String userPassword;
    private String userFirstName;
    private String userLastName;
    private String userPhoneNumber;
    private String userEmail;
    private Date userCreatedDate;
    private Date userUpdatedDate;
    @ManyToOne
    private Role role;
    @OneToMany(mappedBy = "user_")
    private Set<ShippingAddress> shippingAddresses;
    @OneToMany(mappedBy = "user_")
    private Set<Order_> orders;
    @OneToMany(mappedBy = "user_")
    private Set<Comment> comments;

    public User_(String userName, String userPassword, String userFirstName, String userLastName, String userPhoneNumber, String userEmail, Date userCreatedDate, Date userUpdatedDate, Role role, Set<ShippingAddress> shippingAddresses, Set<Order_> orders, Set<Comment> comments) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.userFirstName = userFirstName;
        this.userLastName = userLastName;
        this.userPhoneNumber = userPhoneNumber;
        this.userEmail = userEmail;
        this.userCreatedDate = userCreatedDate;
        this.userUpdatedDate = userUpdatedDate;
        this.role = role;
        this.shippingAddresses = shippingAddresses;
        this.orders = orders;
        this.comments = comments;
    }
}