package com.scinest.domain.reagent.repository;

import com.scinest.domain.reagent.Reagent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaReagentRepository extends JpaRepository<Reagent, Long> {
}
