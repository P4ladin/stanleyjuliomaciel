package br.com.stanleyjuliomaciel.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.stanleyjuliomaciel.domain.Departamento;
import br.com.stanleyjuliomaciel.service.DepartamentoService;

@Controller
@RequestMapping("/departamento")
public class DepartamentoController {
	
	@Autowired
	private DepartamentoService service;
	
	@GetMapping("/cadastrar")
	public String cadastrar( ) {
		return "/departamento/cadastro";
	}
		
		
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("Departamentos", service.buscarTodos());
		return "/departamento/lista";
	}
	
	@PostMapping("/salvar")
	public String Salvar(Departamento departamento) {
		service.salvar(departamento);
		return "redirect:/departamentos/cadastrar";
	 }
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id")Long id, ModelMap model) {
		
		model.addAttribute("departamento", service.buscarPorId(id));
		return "redirect:/departamentos/cadastro";
		
	}
	
	public String editar(Departamento departamento) {
		service.editar(departamento);
		return "redirect:/departamentos/cadastro";
	}
}
		
	


