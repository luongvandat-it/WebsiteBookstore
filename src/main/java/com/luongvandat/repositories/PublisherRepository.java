package com.luongvandat.repositories;

import com.luongvandat.entities.Order_;
import com.luongvandat.entities.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, String> {
}