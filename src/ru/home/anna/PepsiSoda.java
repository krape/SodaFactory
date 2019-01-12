package ru.home.anna;

public class PepsiSoda extends Soda{
    public PepsiSoda() {
        System.out.println("Налили Пепси газяву");
    }

    @Override
    public Soda copy() {
        return new PepsiSoda();
    }
}
