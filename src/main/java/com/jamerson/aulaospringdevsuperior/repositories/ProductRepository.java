package com.jamerson.aulaospringdevsuperior.repositories;

import com.jamerson.aulaospringdevsuperior.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
