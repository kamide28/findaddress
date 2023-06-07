package com.example.htmlpractice;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Address {
    String status;
    String message;
    List<Result> results;
}