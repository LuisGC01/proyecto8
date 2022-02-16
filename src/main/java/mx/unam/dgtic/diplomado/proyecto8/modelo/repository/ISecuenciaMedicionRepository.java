package mx.unam.dgtic.diplomado.proyecto8.modelo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import mx.unam.dgtic.diplomado.proyecto8.modelo.entidades.SecuenciaMedicion;
import mx.unam.dgtic.diplomado.proyecto8.modelo.entidades.Usuario;

@Repository
public interface ISecuenciaMedicionRepository extends CrudRepository<SecuenciaMedicion, Integer> {
	public abstract List<SecuenciaMedicion> findByUsuario(Usuario usuario);
}
