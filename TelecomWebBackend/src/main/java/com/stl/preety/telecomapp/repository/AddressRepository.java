package com.stl.preety.telecomapp.repository;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stl.preety.telecomapp.model.Address;


@Repository
public interface AddressRepository extends CrudRepository<Address, Serializable>{
	
}
