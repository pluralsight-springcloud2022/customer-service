package com.pluralsight.spring.cloud.service.customer.web.rest;

import com.pluralsight.spring.cloud.service.customer.web.rest.vm.CustomerView;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/${app.api.version}/customers")
public class CustomerResource {

    @GetMapping("")
    ResponseEntity<List<CustomerView>> getAllCustomers() {
        return new ResponseEntity<>(
            Arrays.asList(new CustomerView(1, "Michael", "Hoffman")),
                HttpStatus.OK);
    }

    @GetMapping("/{id}")
    ResponseEntity<CustomerView> getCustomerById(@PathVariable int id) {
        return new ResponseEntity<>(
            new CustomerView(1, "Michael", "Hoffman"),HttpStatus.OK);
    }
}
