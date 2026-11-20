package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.internal.commandservices;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.commands.CreateSamplingPlanCommand;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.commandservices.SamplingPlanCommandService;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates.SamplingPlan;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.repositories.ISamplingPlan;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

public class SamplingPlanCommandServiceImpl implements SamplingPlanCommandService {
	private final ISamplingPlan repository;
	
	public SamplingPlanCommandServiceImpl(ISamplingPlan repository) {
		this.repository = repository;
	}
	
	@Override
	@Transactional
	public SamplingPlan handle(CreateSamplingPlanCommand command){
		if(repository.existsByPlanCode(command.planCode())){
			throw new ResponseStatusException(
					HttpStatus.CONFLICT, "Plan Code already exists");
		}
		
		SamplingPlan samplingPlan = new SamplingPlan(
				command.planCode(),
				command.stationId(),
				command.samplingWindow(),
				command.sampleVolume(),
				command.priorityLevel(),
				command.status(),
				command.samplingNotes()
		);
		
		return repository.save(samplingPlan);
	}
}
