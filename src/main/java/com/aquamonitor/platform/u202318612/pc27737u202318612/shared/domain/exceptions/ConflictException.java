package com.aquamonitor.platform.u202318612.pc27737u202318612.shared.domain.exceptions;

/**
 * Unchecked exception for conflicts with the current state of a resource,
 * for example a duplicated unique value.
 */
public class ConflictException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ConflictException(String messageKey) {
        super(messageKey);
    }
}
