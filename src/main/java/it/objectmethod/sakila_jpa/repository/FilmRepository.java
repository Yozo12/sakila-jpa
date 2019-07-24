package it.objectmethod.sakila_jpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.sakila_jpa.domain.Film;

@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {

	@Query("select f from Film f inner join f.actors a where a.actor_id=?")
	public List<Film> filmByActor(int actorId);
}
