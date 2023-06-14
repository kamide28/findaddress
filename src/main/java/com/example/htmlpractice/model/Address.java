package com.example.htmlpractice.model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Address {
    String message;
    List<AddressData> results = new ArrayList<>();
    int status;

}