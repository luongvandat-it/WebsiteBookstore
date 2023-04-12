package com.luongvandat.repositories;

import com.luongvandat.entities.Publisher;
import com.luongvandat.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {
}