package ru.home.anna;

import org.jetbrains.annotations.NotNull;

public class SodaBuilder {
    private SodaFactory factory;
    private Bottle bottle;

    public SodaBuilder(@NotNull SodaFactory factory) {

        this.bottle = factory.createBottle();
        this.factory = factory;
    }

    public void glueLabel() {
        Label label = factory.createLabel();
        bottle.stickLabel(label);
    }

    public void fillBottle() throws BottleExeption {
        Soda soda = factory.makeSoda();
        bottle.pourSoda(soda);
    }

    public void covering() {
        bottle.seal();
    }

    public Bottle build() {
        return bottle.copy();
    }

}
