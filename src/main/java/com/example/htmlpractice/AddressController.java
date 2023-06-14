package com.example.htmlpractice;

import com.example.htmlpractice.model.Address;
import com.example.htmlpractice.model.AddressData;
import com.example.htmlpractice.model.ZipcodeFrom;
import jakarta.servlet.http.HttpSession;
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
    public String index() {
        return "index";
    }

    @GetMapping("/address")
    public String find(HttpSession httpSession, Model model, @ModelAttribute(name = "zipcodeForm")
    @Validated ZipcodeFrom zipcode, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "index";
        }
        Address address = addressService.findZipCode(zipcode.getZipcode());
        model.addAttribute("addressinfo", address);
        List<AddressData> addressData = new ArrayList<>(address.getResults());
        model.addAttribute("addressbody", addressData);
        return "address";
    }
}
