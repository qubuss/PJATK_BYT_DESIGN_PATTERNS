package cw3.builder.domain.picie;

import cw3.builder.domain.Item;
import cw3.builder.domain.Packing;

import java.math.BigDecimal;

public abstract class Picie implements Item {
    public Packing opakowanie() {
        return new Butelka();
    }

    public abstract BigDecimal cena();
}
