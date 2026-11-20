package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.*;

public class SamplingPlan {
	Long id;
	PlanCode planCode;
	StationId stationId;
	SamplingWindow samplingWindow;
	SampleVolume sampleVolume;
	Integer priorityLevel;
	SamplingPlanStatus status;
	String samplingNotes;
	
	SamplingPlan(
			PlanCode planCode,
			StationId stationId,
			SamplingWindow samplingWindow,
			SampleVolume sampleVolume,
			Integer priorityLevel,
			SamplingPlanStatus status,
			String samplingNotes
	) {
		if (planCode == null) {
			throw new IllegalArgumentException("Plan code cannot be null.");
		}
		if (stationId == null) {
			throw new IllegalArgumentException("Station ID cannot be null.");
		}
		if (samplingWindow == null) {
			throw new IllegalArgumentException("Sampling window cannot be null.");
		}
		if (sampleVolume == null) {
			throw new IllegalArgumentException("Sample volume cannot be null.");
		}
		// Condition about priority level
		if (priorityLevel == null) {
			throw new IllegalArgumentException("Priority level cannot be null.");
		}
		if (priorityLevel < 1 || priorityLevel > 5) {
			throw new IllegalArgumentException("Priority level must be between 1 and 5.");
		}
		if (status == null) {
			throw new IllegalArgumentException("Status cannot be null.");
		}
		if (samplingNotes == null || samplingNotes.isBlank()) {
			throw new IllegalArgumentException("Sampling notes cannot be null or blank.");
		}

		this.planCode = planCode;
		this.stationId = stationId;
		this.samplingWindow = samplingWindow;
		this.sampleVolume = sampleVolume;
		this.priorityLevel = priorityLevel;
		this.status = status;
		this.samplingNotes = samplingNotes;
	}
}
