package fr.formation.ponionz.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.ponionz.domain.dtos.RequestCreate;
import fr.formation.ponionz.domain.dtos.RequestView;
import fr.formation.ponionz.services.RequestService;

@RequestMapping("/requests")

@RestController
public class RequestController {

	private final RequestService service;

	public RequestController(RequestService service) {

		this.service = service;
	}

	@PostMapping
	public void create(@Valid @RequestBody RequestCreate dto) {

		service.create(dto);
	}

	@GetMapping("/{id}")
	public RequestView getById(@PathVariable("id") Long id) {

		return service.getById(id);
	}
}
