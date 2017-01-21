package cw3.builder.domain;

import java.math.BigDecimal;

/**
 * Created by qubuss on 27.10.2016.
 */
public interface Item {
    public String nazwa();
    public Packing opakowanie();
    public BigDecimal cena();
}
