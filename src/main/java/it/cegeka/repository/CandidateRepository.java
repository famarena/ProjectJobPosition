package it.cegeka.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import it.cegeka.entities.Candidate;

public interface CandidateRepository extends JpaRepository<Candidate, Integer>{

	
}
