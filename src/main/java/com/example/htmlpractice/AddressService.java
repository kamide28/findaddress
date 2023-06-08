package com.example.htmlpractice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AddressService {
    @Autowired
    private RestTemplate restTemplate;
    private final String url = "https://zipcloud.ibsnet.co.jp/api/search?zipcode={zipcode}";

    public Address findZipCode(String zipcode) {
        ResponseEntity<Address> response = restTemplate.getForEntity(url, Address.class, zipcode);
        return response.getBody();
    }
}
