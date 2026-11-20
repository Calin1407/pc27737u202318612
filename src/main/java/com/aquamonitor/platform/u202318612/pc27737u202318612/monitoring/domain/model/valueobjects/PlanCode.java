package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects;

public record PlanCode(String value) {
	public PlanCode {
		// Validation to ensure value is not null or empty
		if (value == null || value.isBlank()) {
			throw new IllegalArgumentException("Plan code cannot be null or empty");
		}
	}
}
