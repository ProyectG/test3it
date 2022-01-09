package cl.ms.it.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import cl.ms.it.dto.DatosDto;
import cl.ms.it.dto.RespuestaEstandar;
import cl.ms.it.entity.Datos;
import cl.ms.it.repositories.DataForm;

public class FormularioDao {

	@Autowired
	private DataForm data;

	public ResponseEntity<Object> agregarDatos(DatosDto input) {
		RespuestaEstandar resp = new RespuestaEstandar();
		try {
			Datos consulta = data.findByCorreo(input.getCorreo());
			if (consulta == null) {
				Datos peticion = new Datos();
				peticion.setCorreo(input.getCorreo());
				peticion.setSeleccion(input.getSeleccion());
				data.save(peticion);
				resp.setCodigo("00");
				resp.setDescripcion("Informacion enviada con exito.");
			} else {
				resp.setCodigo("02");
				resp.setDescripcion("Ups, el correo utilizado ya fue registrado.");
			}
			return ResponseEntity.ok(resp);
		} catch (IllegalArgumentException e) {
			resp.setCodigo("01");
			resp.setDescripcion("Ups, ha ocurrido algo, intentalo mas tarde.");
			return ResponseEntity.ok(resp);
		}

	}

	public ResponseEntity<Object> listarDatos() {
		return ResponseEntity.ok(data.obtenerResumen());
	}
	
	public ResponseEntity<Object> listarTodo(){
		return ResponseEntity.ok(data.findAll());
	}

}
