package it.objectmethod.sakila_jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import it.objectmethod.sakila_jpa.domain.Actor;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
	
     @Query("select a from Actor a where a.actor_id=?")
	public Actor findByActorId(int actor_id);

}
