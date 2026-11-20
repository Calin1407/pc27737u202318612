package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.repositories;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.entities.SamplingPlanPersistenceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SamplingPlanJpaRepository extends JpaRepository<SamplingPlanPersistenceEntity, Long> {
	boolean existsByPlanCode(String planCode);
}
