package cw3.builder.domain.jedzenie;

import java.math.BigDecimal;

public class Pizza extends Jedzenie {
    public String nazwa() {
        return "Pizza";
    }

    public BigDecimal cena() {
        return BigDecimal.valueOf(20.5);
    }
}
