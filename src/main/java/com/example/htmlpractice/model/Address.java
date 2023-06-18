package com.example.htmlpractice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Address {
    String message;
    List<AddressData> results;
    int status;

}