package fr.formation.ponionz.services;

import javax.validation.Valid;

import fr.formation.ponionz.domain.dtos.RequestCreate;
import fr.formation.ponionz.domain.dtos.RequestView;

public interface RequestService {

	void create(@Valid RequestCreate dto);

	RequestView getById(Long id);

}
