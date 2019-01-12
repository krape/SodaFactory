package ru.home.anna;

public class PepsiFactory extends SodaFactory{
    @Override
    public Bottle createBottle() {
        return new PepsiBottle();
    }

    @Override
    public Label createLabel() {
        return new PepsiLabel();
    }

    @Override
    public Soda makeSoda() {
        return new PepsiSoda();
    }
}
