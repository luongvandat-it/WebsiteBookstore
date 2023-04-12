package com.luongvandat.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String roleId;
    private String roleName;
    @OneToMany(mappedBy = "role")
    private Set<User_> users;

    public Role(String roleName) {
        setRoleName(roleName);
    }
}