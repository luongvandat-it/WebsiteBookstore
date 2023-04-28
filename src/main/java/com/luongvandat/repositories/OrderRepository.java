package com.luongvandat.repositories;

import com.luongvandat.entities.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order_, String> {
}