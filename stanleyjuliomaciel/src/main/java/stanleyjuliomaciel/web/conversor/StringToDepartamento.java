package stanleyjuliomaciel.web.conversor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

import stanleyjuliomaciel.domain.Departamento;
import stanleyjuliomaciel.service.DepartamentoService;

public class StringToDepartamento implements Converter<String, Departamento>{
	
	@Autowired
	private DepartamentoService service;
	
	@Override
	public Departamento convert(String text) {
		if(text.isEmpty()) {
			return null;
		}
		Long id = Long.valueOf(text);
		return service.buscarPorId(id);
	}

}