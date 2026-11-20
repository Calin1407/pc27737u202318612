package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects;

public record SampleVolume(Integer quantity, String unit) {
	public SampleVolume{
		if (quantity <= 0) {
			throw new IllegalArgumentException("Sample volume quantity must be greater than zero.");
		}
		if (unit == null || unit.isBlank()) {
			throw new IllegalArgumentException("Sample volume unit cannot be null or blank.");
		}
	}
	
	public SampleVolume addVolume(Integer additionalVolume) {
		if (additionalVolume <= 0 || Integer.MAX_VALUE - this.quantity < additionalVolume) {
			throw new IllegalArgumentException("Additional volume must be greater than zero and not cause overflow.");
		}
		return new SampleVolume(this.quantity + additionalVolume, this.unit);
	}
}
