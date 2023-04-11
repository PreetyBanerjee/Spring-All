package com.stl.preety.telecomapp.repository;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stl.preety.telecomapp.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Serializable>{
	
}
