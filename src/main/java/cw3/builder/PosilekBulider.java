package cw3.builder;

import cw3.builder.domain.picie.Herbata;
import cw3.builder.domain.jedzenie.Kanapka;
import cw3.builder.domain.jedzenie.Pizza;
import cw3.builder.domain.picie.Woda;

public class PosilekBulider {

    public Posilek przygotujPizze (){
        Posilek posilek = new Posilek();
        posilek.dodajDoPosilku(new Pizza());
        posilek.dodajDoPosilku(new Woda());
        return posilek;
    }

    public Posilek przygotujKanapke (){
        Posilek posilek = new Posilek();
        posilek.dodajDoPosilku(new Kanapka());
        posilek.dodajDoPosilku(new Herbata());
        return posilek;
    }
}
