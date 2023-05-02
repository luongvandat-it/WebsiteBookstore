package com.luongvandat.repositories;

import com.luongvandat.entities.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, String> {
    @Query(value = "insert into order_detail(price, quantity, book_id, order_id) values (?1, ?2, ?3, ?4)", nativeQuery = true)
    OrderDetail saveOrderDetail(double price, int quantity, String bookId, String orderId);
}