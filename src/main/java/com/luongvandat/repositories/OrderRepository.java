package com.luongvandat.repositories;

import com.luongvandat.entities.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order_, String> {
    @Query("select o from Order_ o join o.user_ u where u.userEmail = ?1")
    List<Order_> findOrdersByUserEmail(String userEmail);
}