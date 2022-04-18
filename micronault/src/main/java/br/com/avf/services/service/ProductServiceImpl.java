package br.com.avf.services.service;

import br.com.avf.services.codec.Codec;
import br.com.avf.services.entities.Product;
import br.com.avf.services.protocols.ProductRequest;
import br.com.avf.services.protocols.ProductResponse;
import br.com.avf.services.repository.ProductRepository;
import io.micronaut.context.annotation.Requires;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@Singleton
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;

    @Override
    public ProductResponse create(Product product) {
        var created = this.repository.save(product);
        return Codec.toResponse(created);
    }

    @Override
    public ProductResponse findById(Long id) {
        var found = this.repository.findById(id);
        return Codec.toResponse(found.orElseThrow(() -> new RuntimeException("Não localizado!")));
    }

}
