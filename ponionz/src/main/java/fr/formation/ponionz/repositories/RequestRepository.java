package fr.formation.ponionz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.ponionz.domain.entities.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {

}
