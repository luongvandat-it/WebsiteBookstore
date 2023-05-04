package com.luongvandat.repositories;

import com.luongvandat.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    @Query(value = "INSERT INTO order_detail(price, quantity, order__order_id, book_book_id) VALUES (?1, ?2, ?3, ?4)", nativeQuery = true)
    void saveOrderDetail(double price, int quantity, String orderId, String bookId);
}