package com.aquamonitor.platform.u202318612.pc27737u202318612.shared.domain.exceptions;

/**
 * Unchecked exception for resources that cannot be found.
 */
public class NotFoundException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public NotFoundException(String messageKey) {
        super(messageKey);
    }
}
