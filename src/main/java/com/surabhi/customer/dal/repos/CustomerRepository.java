package com.surabhi.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.surabhi.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
