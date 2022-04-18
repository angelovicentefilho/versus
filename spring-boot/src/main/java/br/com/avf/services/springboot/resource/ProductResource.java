package br.com.avf.services.springboot.resource;

import br.com.avf.services.springboot.codec.Codec;
import br.com.avf.services.springboot.protocols.ProductRequest;
import br.com.avf.services.springboot.protocols.ProductResponse;
import br.com.avf.services.springboot.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@RestController
@RequestMapping("/api/v1/products")
@RequiredArgsConstructor
public class ProductResource {

    private final ProductService service;

    @PostMapping
    public ProductResponse create(@RequestBody ProductRequest request) {
        return service.create(Codec.toProduct(request));
    }

    @GetMapping("/{id}")
    public ProductResponse findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
