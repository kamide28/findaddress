package com.example.htmlpractice;

import com.example.htmlpractice.model.Address;
import com.example.htmlpractice.model.AddressData;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AddressController {
    @Autowired
    AddressService addressService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/address")
    public String find(HttpSession httpSession, Model model, @RequestParam("zipcode") String zipcode) {
        Address address = addressService.findZipCode(zipcode);
        model.addAttribute("addressinfo", address);
        List<AddressData> addressData = new ArrayList<>(address.getResults());
        model.addAttribute("addressbody", addressData);
        return "address";
    }
}
