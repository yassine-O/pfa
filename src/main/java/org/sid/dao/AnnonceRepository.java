package org.sid.dao;

import org.sid.model.Annonce;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AnnonceRepository extends JpaRepository<Annonce, Long> {
	
}
