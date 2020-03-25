package com.org.spring.mvc.Jsp.controller;

import com.org.spring.mvc.Jsp.model.OrderProduct;
import com.org.spring.mvc.Jsp.repository.OrderProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class OrderProductController {

    @Autowired
    private OrderProductRepository orderProductRepository;


    @RequestMapping(value = "/addproduct", method = RequestMethod.POST)
    public String addProductToDb(@ModelAttribute OrderProduct orderProduct) {
        orderProductRepository.save(orderProduct);
        return "redirect:success";
    }

    @RequestMapping(value = "/allprodectorder", method = RequestMethod.GET)
    public String getAllProductOrder(Model model) {
        model.addAttribute("order", orderProductRepository.findAll());
        return "/view";
    }
}
