package com.shopflow.repository;

import com.shopflow.model.CartItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

public interface CartRepository extends MongoRepository<CartItem, String> {
    List<CartItem> findByCustomerId(String customerId);

    @Transactional
    void deleteByCustomerId(String customerId);
}

