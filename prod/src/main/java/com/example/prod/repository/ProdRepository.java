package com.example.prod.repository;

import com.example.prod.model.Prod;
import org.springframework.data.repository.CrudRepository;

public interface ProdRepository extends CrudRepository<Prod,String> {
}
