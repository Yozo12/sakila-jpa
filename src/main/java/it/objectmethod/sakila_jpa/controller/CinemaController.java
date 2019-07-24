package it.objectmethod.sakila_jpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.objectmethod.sakila_jpa.domain.Actor;
import it.objectmethod.sakila_jpa.domain.Film;
import it.objectmethod.sakila_jpa.repository.ActorRepository;
import it.objectmethod.sakila_jpa.repository.FilmRepository;

@RestController
@CrossOrigin
public class CinemaController {
	@Autowired
	private FilmRepository repoFilm;
	@Autowired
	ActorRepository repoAct;

	@GetMapping("/filmbyactor")
	public List<Film> filmByActor(@RequestParam("actor_id") int actorId) {
		List<Film> listFilm = repoFilm.filmByActor(actorId);
		return listFilm;
	}

	@GetMapping("/gatallactor")
	public List<Actor> allActors() {
		List<Actor> listActor = repoAct.findAll();
		return listActor;
	}

	@GetMapping("/actor")
	public Actor actor(@RequestParam("actor_id") int actor_id) {
		Actor actor = repoAct.findByActorId(actor_id);
		return actor;
	}
}
