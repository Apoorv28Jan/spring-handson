package com.test.springapplications.dao;


import com.test.springapplications.model.ProductRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<ProductRequest, Long> {

}
