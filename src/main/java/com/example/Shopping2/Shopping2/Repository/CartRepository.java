package com.example.Shopping2.Shopping2.Repository;

import com.example.Shopping2.Shopping2.Entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity,Integer> {
}
