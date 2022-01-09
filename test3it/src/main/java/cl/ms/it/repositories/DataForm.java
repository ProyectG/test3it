package cl.ms.it.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cl.ms.it.entity.Datos;

public interface DataForm extends CrudRepository<Datos,Long>{
	
	@Query( nativeQuery=true, value="SELECT seleccion as name, count(seleccion) as value FROM datos GROUP BY seleccion ORDER BY seleccion asc")
	public List<IdatosRespuesta> obtenerResumen();
	
	public Datos findByCorreo(String correo);
	
}
