package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects;

import java.time.LocalDate;

public record SamplingWindow(LocalDate startDate, LocalDate endDate) {
	public SamplingWindow {
		if (startDate == null || endDate == null) {
			throw new IllegalArgumentException("Start date and end date cannot be null.");
		}
		if (startDate.isAfter(endDate)) {
			throw new IllegalArgumentException("Start date cannot be after end date.");
		}
	}
	
	// Specifies that SamplingWindow is a value object
	// that contains the properties StartDate and
	// EndDate, both of type LocalDate.
	public boolean contains(LocalDate checkDate) {
		if (checkDate == null) {
			throw new IllegalArgumentException("Check date cannot be null.");
		}
		return !checkDate.isBefore(startDate) && !checkDate.isAfter(endDate);
	}
}
