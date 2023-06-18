package com.example.htmlpractice.model;

import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class ZipCodeForm {
    @Length(min = 7, max = 7, message = "７桁で入力してください")
    @Pattern(regexp = "^[0-9]+$", message = "数値を入力してください")
    private String zipcode;

    public ZipCodeForm(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getZipcode() {
        return zipcode;
    }
}
