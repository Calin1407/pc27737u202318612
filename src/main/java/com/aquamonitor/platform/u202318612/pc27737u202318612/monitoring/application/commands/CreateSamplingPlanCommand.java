package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.commands;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.*;

public record CreateSamplingPlanCommand (
		PlanCode planCode,
		StationId stationId,
		SamplingWindow samplingWindow,
		SampleVolume sampleVolume,
		Integer priorityLevel,
		SamplingPlanStatus status,
		String samplingNotes
){}