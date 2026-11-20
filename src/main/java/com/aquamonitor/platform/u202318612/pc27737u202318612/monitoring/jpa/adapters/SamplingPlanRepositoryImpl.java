package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.adapters;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates.SamplingPlan;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.PlanCode;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.repositories.ISamplingPlan;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.mappers.SamplingPlanPersistenceMapper;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.repositories.SamplingPlanJpaRepository;

import java.util.List;
import java.util.Optional;

public class SamplingPlanRepositoryImpl implements ISamplingPlan {
	private final SamplingPlanJpaRepository repository;
	private final SamplingPlanPersistenceMapper mapper;
	
	
	public SamplingPlanRepositoryImpl(SamplingPlanJpaRepository repository, SamplingPlanPersistenceMapper mapper) {
		this.repository = repository;
		this.mapper = mapper;
	}
	
	@Override
	public boolean existsByPlanCode(PlanCode planCode) {
		return repository.existsByPlanCode(
				planCode.value()
		);
	}
	
	@Override
	public List<SamplingPlan> findAll() {
		return List.of();
	}
	
	// To this PC2 I just implemented POST
	@Override
	public SamplingPlan save(SamplingPlan samplingPlan) {
		var saved = repository.save(mapper.toEntity(samplingPlan));
		return mapper.toDomain(saved);
	}
	
	@Override
	public SamplingPlan update(SamplingPlan samplingPlan) {
		return null;
	}
	
	@Override
	public Optional<SamplingPlan> findById(Long aLong) {
		return Optional.empty();
	}
	
	@Override
	public void deleteById(Long aLong) {
	
	}
	
	@Override
	public void deleteAll() {
	
	}
}
