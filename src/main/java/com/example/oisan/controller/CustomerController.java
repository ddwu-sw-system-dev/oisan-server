package com.example.oisan.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.oisan.domain.Customer;
import com.example.oisan.service.CustomerService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	public void setCustomerService(CustomerService customerService) {
		this.customerService = customerService;
	}
	
	@PostMapping("/create")
	public Customer create(@RequestBody CustomerCommand customerCom) {
		System.out.println("customerCom = " + customerCom);
		return customerService.addCustomer(customerCom);
	}
	
	@PutMapping
	public void update(CustomerUpdateCommand updateCustomer) {
		customerService.updateCustomer(updateCustomer);
	}
	
	@DeleteMapping
	public void delete(@PathVariable String customerId) {
		int id = Integer.parseInt(customerId);
		customerService.deleteCustomer(id);
	}
	
	@GetMapping("/{customerId}")
	public Customer getCustomerById(@PathVariable String customerId) {
		int id = Integer.parseInt(customerId);
		return customerService.getCustomerInfoByCustomerId(id); //test obj
	}
	
	@PostMapping("/login")
	public Customer loginCustomer(@RequestBody CustomerCommand customerCom) {
		System.out.println(customerCom.getEmail());
		System.out.println(customerCom.getPw());
		return customerService.loginCustomer(customerCom.getEmail(), customerCom.getPw());
	}
	
	@GetMapping
	public List<Customer> getCustomerList(){
		return customerService.getCustomers();
	}

}