package cw3.builder.domain.jedzenie;

import java.math.BigDecimal;

public class Kanapka extends Jedzenie {
    public String nazwa() {
        return "Kanapka";
    }

    public BigDecimal cena() {
        return BigDecimal.valueOf(13.5);
    }
}
