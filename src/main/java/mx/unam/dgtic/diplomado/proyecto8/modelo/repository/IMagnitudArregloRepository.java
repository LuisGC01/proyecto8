package mx.unam.dgtic.diplomado.proyecto8.modelo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.unam.dgtic.diplomado.proyecto8.modelo.entidades.MagnitudArreglo;
import mx.unam.dgtic.diplomado.proyecto8.modelo.entidades.ModeloMatematico;

@Repository
public interface IMagnitudArregloRepository extends CrudRepository<MagnitudArreglo, Integer> {

	public abstract void deleteByModeloMatematico(ModeloMatematico modeloMatematico);

}
