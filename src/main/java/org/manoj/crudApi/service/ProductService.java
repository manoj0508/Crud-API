package org.manoj.crudApi.service;

import org.manoj.crudApi.model.ProductDTO;
import org.springframework.stereotype.Service;


public interface ProductService {

    public void createNewProduct(ProductDTO productDTO);
}
