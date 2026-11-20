package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects;

import java.util.UUID;

public record StationId(UUID value) {
	private static final UUID EMPTY_UUID = new UUID(0L, 0L);
	
	public StationId{
		if (value == null){
			throw new IllegalArgumentException(
					"Station identifier cannot be null"
			);
		}
		if (value.equals(EMPTY_UUID)){
			throw new IllegalArgumentException(
					"Station identifier cannot be an empty UUID"
			);
		}
	}
}
