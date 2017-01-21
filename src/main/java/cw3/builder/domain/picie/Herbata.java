package cw3.builder.domain.picie;

import java.math.BigDecimal;

public class Herbata extends Picie {


    public String nazwa() {
        return "Herbata";
    }

    public BigDecimal cena() {
        return BigDecimal.valueOf(5.3);
    }
}
