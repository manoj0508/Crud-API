package org.manoj.crudApi.controller;

import org.manoj.crudApi.model.ProductDTO;
import org.manoj.crudApi.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor/v1")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @Autowired
    private ProductService productService;

    @PostMapping("/product")
    public ResponseEntity<String> createProduct(@RequestBody ProductDTO productDTO) {

        logger.info("api request received");
        if (null != productDTO) {
            productService.createNewProduct(productDTO);
        }

        return ResponseEntity.ok("created");
    }
}
