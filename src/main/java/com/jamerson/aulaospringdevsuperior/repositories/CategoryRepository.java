package com.jamerson.aulaospringdevsuperior.repositories;

import com.jamerson.aulaospringdevsuperior.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
