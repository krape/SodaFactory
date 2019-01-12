package ru.home.anna;

public class ColaFactory extends SodaFactory {
    @Override
    public Bottle createBottle() {
        return new ColaBottle();
    }

    @Override
    public Label createLabel() {
        return new ColaLabel();
    }

    @Override
    public Soda makeSoda() {
        return new ColaSoda();
    }
}
