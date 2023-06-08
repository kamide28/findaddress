package com.example.htmlpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/address")
    public Address find(@RequestParam("zipcode") String zipcode) {
        return addressService.findZipCode(zipcode);
    }
}
