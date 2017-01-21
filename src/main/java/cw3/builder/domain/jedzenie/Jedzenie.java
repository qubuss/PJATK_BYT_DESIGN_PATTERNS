package cw3.builder.domain.jedzenie;

import cw3.builder.domain.Item;
import cw3.builder.domain.Packing;

import java.math.BigDecimal;

public abstract class Jedzenie implements Item {

    public Packing opakowanie() {
        return new Opakowanie();
    }

    public abstract BigDecimal cena();
}
