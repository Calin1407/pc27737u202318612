package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.embeddables;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SampleVolumeEmbeddable {
	@Column(name = "quantity", nullable = false)
	private Integer quantity;
	
	@Column(name = "unit", nullable = false)
	private String unit;
}
