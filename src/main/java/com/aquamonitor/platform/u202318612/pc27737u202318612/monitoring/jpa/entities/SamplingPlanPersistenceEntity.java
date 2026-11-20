package com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.jpa.entities;

import com.aquamonitor.platform.u202318612.pc27737u202318612.monitoring.domain.model.valueobjects.*;
import com.aquamonitor.platform.u202318612.pc27737u202318612.shared.infrastructure.persistence.jpa.AuditableAbstractPersistenceEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
		name = "sampling_plans",
		uniqueConstraints = {
				@UniqueConstraint(
						name = "uk_sampling_plans_plan_code",
						columnNames = "plan_code"
				)
		}
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SamplingPlanPersistenceEntity extends AuditableAbstractPersistenceEntity {
	@Column(name = "plan_code", nullable = false)
	String planCode;
	
	@Column(name = "station_id", nullable = false)
	String stationId;
	
	@Embedded
	SamplingWindow samplingWindow;
	
	@Embedded
	SampleVolume sampleVolume;
	
	@Column(name = "priority_level")
	Integer priorityLevel;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "status", nullable = false)
	SamplingPlanStatus status;
	
	@Column(name = "sampling_notes", columnDefinition = "TEXT")
	String samplingNotes;
}
