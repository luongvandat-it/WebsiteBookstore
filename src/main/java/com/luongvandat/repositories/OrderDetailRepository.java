package com.luongvandat.repositories;

import com.luongvandat.entities.OrderDetail;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;

@Repository
@CrossOrigin(origins = "http://localhost:3000/",methods = {RequestMethod.GET, RequestMethod.PUT, RequestMethod.POST})
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO order_detail(price, quantity, order__order_id, book_book_id) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void saveOrderDetail(double price, int quantity, String orderId, String bookId);
}