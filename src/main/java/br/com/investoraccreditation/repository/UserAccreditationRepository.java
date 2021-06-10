package br.com.investoraccreditation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.investoraccreditation.model.UserAccreditation;

public interface UserAccreditationRepository extends JpaRepository<UserAccreditation, Long> {

	
	UserAccreditation findByUserId(String userId);

}
