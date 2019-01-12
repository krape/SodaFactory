package ru.home.anna;

public class ColaSoda extends Soda {
    public ColaSoda() {
        System.out.println("Налили Кола газяву");
    }

    @Override
    public Soda copy() {
        return new ColaSoda();
    }
}
