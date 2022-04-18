package br.com.avf.services.springboot.service;


import br.com.avf.services.springboot.codec.Codec;
import br.com.avf.services.springboot.entities.Product;
import br.com.avf.services.springboot.protocols.ProductResponse;
import br.com.avf.services.springboot.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@Service
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
