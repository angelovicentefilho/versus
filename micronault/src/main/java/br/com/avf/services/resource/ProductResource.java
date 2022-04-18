package br.com.avf.services.resource;

import br.com.avf.services.codec.Codec;
import br.com.avf.services.protocols.ProductRequest;
import br.com.avf.services.protocols.ProductResponse;
import br.com.avf.services.service.ProductService;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;
import lombok.RequiredArgsConstructor;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@Controller("/api/v1/products")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService service;

    @Post
    public ProductResponse create(@Body ProductRequest request) {
        return service.create(Codec.toProduct(request));
    }

    @Get("/{id}")
    public ProductResponse findById(Long id) {
        return service.findById(id);
    }

}
