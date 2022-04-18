package br.com.avf.services.springboot.repository;

import br.com.avf.services.springboot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


/**
 * @author angelo.vicente - angelovicentefilho@gmail.com
 * @since 2022-04-14, Thursday
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
