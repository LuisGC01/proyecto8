package mx.unam.dgtic.diplomado.proyecto8.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.unam.dgtic.diplomado.proyecto8.modelo.entidades.MagnitudDetalle;

@Repository
public interface IMagnitudDetalleRepository extends CrudRepository<MagnitudDetalle, Integer> {

}
