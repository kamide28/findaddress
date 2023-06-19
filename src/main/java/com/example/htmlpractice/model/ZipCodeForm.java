package com.example.htmlpractice.model;

import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import org.hibernate.validator.constraints.Length;

@Getter
public class ZipCodeForm {
    @Length(min = 7, max = 7, message = "7桁で入力してください")
    @Pattern(regexp = "^[0-9]+$", message = "数値を入力してください")
    private String zipCode;

    public ZipCodeForm(String zipCode) {
        this.zipCode = zipCode;
    }
}
