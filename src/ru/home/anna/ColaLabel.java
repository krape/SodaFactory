package ru.home.anna;

public class ColaLabel extends Label {
    public ColaLabel() {
        System.out.println("Создали этикетку Колы");
    }

    @Override
    public Label copy() {
        return new ColaLabel();
    }
}
