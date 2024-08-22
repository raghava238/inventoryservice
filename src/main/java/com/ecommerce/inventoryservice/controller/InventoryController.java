package com.ecommerce.inventoryservice.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/inventory")
@Slf4j
public class InventoryController {





    @PostMapping("/addStock")
    public String addStock() {

        return "Stock added";
    }

    @GetMapping("/getStock")
    public List<String> getStock() {

        return List.of("iphone","one plus");
    }






}
