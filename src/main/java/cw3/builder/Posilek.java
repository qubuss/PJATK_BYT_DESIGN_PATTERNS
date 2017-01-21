package cw3.builder;

import cw3.builder.domain.Item;
import org.apache.log4j.Logger;

import java.math.BigDecimal;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

public class Posilek {
    private final static Logger LOGGER = Logger.getLogger(Posilek.class);
    private List<Item> items = new ArrayList<Item>();

    public void dodajDoPosilku(Item item){
        items.add(item);
    }

    public BigDecimal calkowitaCena(){
        BigDecimal cena = BigDecimal.ZERO;

        for (Item item : items) {
           cena = cena.add(item.cena());
        }
        return cena;
    }

    public void showItems(){

        for (Item item : items) {
            LOGGER.info(MessageFormat.format("Jedzenie: {0}", item.nazwa()));
            LOGGER.info(MessageFormat.format("Opakowanie: {0}", item.opakowanie().zapakuj()));
            LOGGER.info(MessageFormat.format("Cena: {0}", item.cena()));

        }
    }
}
