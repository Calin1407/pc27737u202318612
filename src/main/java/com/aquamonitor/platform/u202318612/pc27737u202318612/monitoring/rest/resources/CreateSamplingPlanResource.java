package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.rest.resources;

import java.time.LocalDate;

public record CreateSamplingPlanResource(
		String planCode,
		String stationId,
		LocalDate startDate,
		LocalDate endDate,
		Integer quantity,
		String unit,
		Integer priorityLevel,
        String status,
		String samplingNotes
) {
}
