package ru.home.anna;

public class PepsiLabel extends Label {
    public PepsiLabel() {
        System.out.println("Приклеили Пепси этикетку");
    }

    @Override
    public Label copy() {
        return new PepsiLabel();
    }
}
