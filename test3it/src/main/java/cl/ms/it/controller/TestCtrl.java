package cl.ms.it.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.ms.it.dao.FormularioDao;
import cl.ms.it.dto.DatosDto;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/formulario/")
public class TestCtrl extends FormularioDao {
	
	@PutMapping(value="add")
	public ResponseEntity<Object> agregar(@RequestBody DatosDto input)
	{
		return agregarDatos(input);
	}
	
	@GetMapping(value="get")
	public ResponseEntity<Object> obtener()
	{
		return listarDatos();
	}
	
	@GetMapping(value="list")
	public ResponseEntity<Object> listar(){
		return listarTodo();
	}

}
