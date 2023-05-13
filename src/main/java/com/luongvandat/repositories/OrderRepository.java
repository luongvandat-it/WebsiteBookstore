package com.luongvandat.repositories;

import com.luongvandat.entities.Order_;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Repository
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.POST})
public interface OrderRepository extends JpaRepository<Order_, String> {
    @Query("select o from Order_ o join o.user_ u where u.userEmail = ?1")
    List<Order_> findOrdersByUserEmail(String userEmail);
}