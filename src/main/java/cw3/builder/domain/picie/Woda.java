package cw3.builder.domain.picie;

import java.math.BigDecimal;

public class Woda extends Picie {
    public String nazwa() {
        return "Woda";
    }

    public BigDecimal cena() {
        return BigDecimal.valueOf(2.5);
    }
}
