package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.repositories;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.aggregates.SamplingPlan;
import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.PlanCode;
import com.aquamonitor.platform.u202318612.pc27737u202318612.shared.domain.repositories.ICrudService;

public interface ISamplingPlan extends ICrudService<SamplingPlan, Long> {
	boolean existsByPlanCode(PlanCode planCode);
}
