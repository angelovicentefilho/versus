package br.com.avf.services.service;

import br.com.avf.services.entities.Product;
import br.com.avf.services.protocols.ProductResponse;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
public interface ProductService {
    ProductResponse create(Product product);

    ProductResponse findById(Long id);
}
