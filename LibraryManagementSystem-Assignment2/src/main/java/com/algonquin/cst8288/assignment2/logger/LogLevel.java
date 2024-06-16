package com.algonquin.cst8288.assignment2.logger;

/**
 * Enum to represent various levels of logging.
 * @author Hongxiu Guo
 */
public enum LogLevel {
    TRACE(1),
    DEBUG(2),
    INFO(3),
    WARN(4),
    ERROR(5);

    final int level;

    LogLevel(int level) {
        this.level = level;
    }
}
