package br.com.avf.services.repository;

import br.com.avf.services.entities.Product;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;

/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
