package cw3.builder;


import org.apache.log4j.Logger;

import java.text.MessageFormat;

class Test3 {
    private final static Logger LOGGER = Logger.getLogger(Test3.class);

    public static void main(String[] args) {


        PosilekBulider mealBuilder = new PosilekBulider();

        Posilek pizza = mealBuilder.przygotujPizze();
        LOGGER.info("Pizza i Woda");
        pizza.showItems();
        LOGGER.info(MessageFormat.format("Całkowity koszt {0}",pizza.calkowitaCena()));

        Posilek kanapka = mealBuilder.przygotujKanapke();
        LOGGER.info("Kanapka i Herbata");
        kanapka.showItems();
        LOGGER.info(MessageFormat.format("Całkowity koszt {0}",kanapka.calkowitaCena()));
    }
}
