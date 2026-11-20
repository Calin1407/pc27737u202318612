package com.aquamonitor.platform.u202318612.pc27737u202318612.shared.domain.exceptions;

/**
 * Unchecked exception for failed authentication attempts.
 */
public class UnauthorizedException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnauthorizedException(String messageKey) {
        super(messageKey);
    }
}
