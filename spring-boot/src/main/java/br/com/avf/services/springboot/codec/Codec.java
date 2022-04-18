package br.com.avf.services.springboot.codec;


import br.com.avf.services.springboot.entities.Product;
import br.com.avf.services.springboot.protocols.ProductRequest;
import br.com.avf.services.springboot.protocols.ProductResponse;
import lombok.experimental.UtilityClass;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@UtilityClass
public class Codec {
    public static ProductResponse toResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .quantity(product.getQuantity())
                .price(product.getPrice())
                .build();
    }

    public static Product toProduct(ProductRequest request) {
        return Product.builder()
                .id(request.getId())
                .name(request.getName())
                .quantity(request.getQuantity())
                .price(request.getPrice())
                .build();
    }
}
