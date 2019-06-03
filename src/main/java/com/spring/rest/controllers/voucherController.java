package com.spring.rest.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.rest.models.voucher;
import com.spring.rest.repository.voucherRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
@RequestMapping("/vouchers")
class voucherController {
	
	private final voucherRepository repository;
	
	voucherController(voucherRepository repository){
		this.repository = repository;
	}
	
	@GetMapping()
	List<voucher> all(){
		return repository.findAll();
	}
	
	@GetMapping("/vouchers/{id}")
	Optional<voucher> one(@PathVariable Long id) {

	  return repository.findById(id);
	}	

	@PostMapping()
	voucher newVoucher(@RequestBody voucher newVoucher) {
		return repository.save(newVoucher);
	}
	
	@PutMapping("/voucher/{id}")
	Optional<voucher> replaceVoucher(@RequestBody voucher newVoucher, @PathVariable Long id){
		return repository.findById(id);
	}
}

