package com.repositories;

import com.entity.Address;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AddressRepository extends CrudRepository<Address, Integer> {
    List<Address> findByCity(String city);
}
