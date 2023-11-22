package org.example;

import java.math.BigDecimal;

public class Calculator {
    public BigDecimal calculate(BigDecimal a, BigDecimal b, Operation operation) {
        switch (operation) {
            case ADD:
                return a.add(b);
            case SUBTRACT:
                return a.subtract(b);
            case MULTIPLY:
                return a.multiply(b);
            case DIVIDE:
                return a.divide(b);
            case MIN:
                return a.min(b);
            case MAX:
                return a.max(b);
            default:
                throw new UnsupportedOperationException(
                        "operazione sconosciuta " + operation
                );
        }
    }
}
