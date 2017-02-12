package com.sudhakar.store.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sudhakar.store.domain.Productbasic;
import com.sudhakar.store.services.ProductBasicService;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductBasicService service;

    @RequestMapping( method = RequestMethod.GET, produces = "application/json" )
    public ResponseEntity<List<Productbasic>> getProducts(){
        return new ResponseEntity(service.getProductsbasic(), HttpStatus.OK);
    }

}

