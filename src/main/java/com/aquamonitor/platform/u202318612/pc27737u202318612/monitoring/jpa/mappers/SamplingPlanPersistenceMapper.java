package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.mappers;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates.SamplingPlan;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.PlanCode;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.SampleVolume;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.SamplingWindow;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.StationId;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.entities.SamplingPlanPersistenceEntity;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SamplingPlanPersistenceMapper {
    public SamplingPlanPersistenceEntity toEntity(SamplingPlan domain){
		if (domain == null){
			return null;
		}
		SamplingPlanPersistenceEntity entity = new SamplingPlanPersistenceEntity();
		
		entity.setPlanCode(domain.getPlanCode().value());
		entity.setStationId(domain.getStationId().toString());
		entity.setSamplingWindow(
				new SamplingWindow(
						domain.getSamplingWindow().startDate(),
						domain.getSamplingWindow().endDate()
				)
		);
		entity.setSampleVolume(
				new SampleVolume(
						domain.getSampleVolume().quantity(),
						domain.getSampleVolume().unit()
				)
		);
		entity.setPriorityLevel(domain.getPriorityLevel());
		entity.setStatus(domain.getStatus());
		entity.setSamplingNotes(domain.getSamplingNotes());
		
		return entity;
    }
	
	public SamplingPlan toDomain(SamplingPlanPersistenceEntity entity){
		if (entity == null){
			return null;
		}
		
		SamplingPlan domain = new SamplingPlan(
			new PlanCode(entity.getPlanCode()),
			new StationId(UUID.fromString(entity.getStationId())),
			new SamplingWindow(
					entity.getSamplingWindow().startDate(),
					entity.getSamplingWindow().endDate()
			),
			new SampleVolume(
					entity.getSampleVolume().quantity(),
					entity.getSampleVolume().unit()
			),
			entity.getPriorityLevel(),
			entity.getStatus(),
			entity.getSamplingNotes()
		);
		
		domain.setId(entity.getId());
		
		return domain;
	}
}
