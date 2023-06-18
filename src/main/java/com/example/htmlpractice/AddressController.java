package com.example.htmlpractice;

import com.example.htmlpractice.model.Address;
import com.example.htmlpractice.model.AddressData;
import com.example.htmlpractice.model.ZipCodeForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.List;

@Controller
@Validated
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/")
    public String index(Model model, ZipCodeForm zipCode) {
        model.addAttribute("zipcodeForm", zipCode);
        return "index";
    }

    @GetMapping("/address")
    public String find(Model model, @ModelAttribute(name = "zipCodeForm")
    @Validated ZipCodeForm zipCode, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return index(model, zipCode);
        }
        Address address = addressService.findZipCode(zipCode.getZipCode());
        model.addAttribute("addressinfo", address);
        if (address.getResults() != null) {
            List<AddressData> addressData = new ArrayList<>(address.getResults());
            model.addAttribute("addressbody", addressData);
        } else {
            String message = "郵便番号(" + zipCode.getZipCode() + ")は存在しない可能性があります、入力した数字を確認してください";
            model.addAttribute("addressnullmessage", message);
        }
        return "address";
    }
}
