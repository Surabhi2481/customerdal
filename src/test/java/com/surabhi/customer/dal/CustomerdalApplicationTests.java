package com.surabhi.customer.dal;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.surabhi.customer.dal.entities.Customer;
import com.surabhi.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository customerRepository;

	@Test
	public void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Aashi");
		customer.setEmail("aashi@email.com");
		customerRepository.save(customer);
	}

	@Test
	public void testCreateCustomer2() {
		Customer customer = new Customer();
		customer.setName("Tejas");
		customer.setEmail("tejas@email.com");
		customerRepository.save(customer);
	}

	@Test
	public void testFindCustomer() {
		Customer customer = customerRepository.findById(1l).get();
		System.out.println(customer);
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = customerRepository.findById(2l).get();
		customer.setEmail("tejas@gmail.com");
		customerRepository.save(customer);
		System.out.println(customer);
	}

	@Test
	public void testDeleteCustomer() {
		Customer customer = customerRepository.findById(2l).get();
		customerRepository.delete(customer);
	}
}
