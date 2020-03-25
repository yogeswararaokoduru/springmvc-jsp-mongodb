package com.org.spring.mvc.Jsp.repository;

import com.org.spring.mvc.Jsp.model.OrderProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderProductRepository extends MongoRepository<OrderProduct,Integer> {
}
