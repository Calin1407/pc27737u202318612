package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.commandservices;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.application.commands.CreateSamplingPlanCommand;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates.SamplingPlan;

public interface SamplingPlanCommandService {
	SamplingPlan handle(
			CreateSamplingPlanCommand command
	);
}