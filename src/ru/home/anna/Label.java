package ru.home.anna;

public abstract class Label {
    public Label() {
        System.out.println("Создали абстрактную этикетку");
    }
    public abstract Label copy();
}
