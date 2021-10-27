package com.example.Shopping2.Shopping2.Repository;

import com.example.Shopping2.Shopping2.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {

   List<ProductEntity> findAllByProdShpId(int prodShpId);
//    ProductEntity save(ProductEntity prodUpEntity);
}
