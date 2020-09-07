  package com.test.springapplications.service;

  import com.test.springapplications.dao.UserRepository;
  import com.test.springapplications.model.ProductRequest;
  import org.springframework.beans.factory.annotation.Autowired; import
  org.springframework.stereotype.Service;

  @Service
  public class ProductService {

  @Autowired
  private UserRepository userRepository;

  public void add(ProductRequest productRequest) {
  userRepository.save(productRequest); }
  }
