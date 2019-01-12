package ru.home.anna;


public class Main {

    public static void main(String[] args) {
        SodaFactory factory = new PepsiFactory();

        SodaBuilder builder = new SodaBuilder(factory);
        builder.glueLabel();
        try {
            builder.fillBottle();
        } catch (BottleExeption bottleExeption) {
            bottleExeption.printStackTrace();
        }
        builder.covering();
        Bottle bottle = builder.build();
        System.out.println(bottle);

        Bottle bottle2 = builder.build();

        if (bottle == bottle2) {
            System.out.println("Одна и та же бутылка");
        } else {
            System.out.println("Разные бутылки");
        }
    }
}
