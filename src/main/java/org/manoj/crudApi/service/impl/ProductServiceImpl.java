package org.manoj.crudApi.service.impl;

import org.manoj.crudApi.entity.Product;
import org.manoj.crudApi.model.ProductDTO;
import org.manoj.crudApi.repository.ProductRepository;
import org.manoj.crudApi.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    private static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void createNewProduct(ProductDTO productDTO) {

        Product product = new Product();
        product.setProductId(productDTO.getProductId());
        product.setProductName(productDTO.getProductName());
        product.setProductType(productDTO.getProductType());
        product.setDescription(productDTO.getDescription());
        product.setDisplayName(productDTO.getDisplayName());
        product.setManufactureName(productDTO.getManufactureName());

        productRepository.save(product);

        logger.info("product created with product id : {}", productDTO.getProductId());
    }
}
