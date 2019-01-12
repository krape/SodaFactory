package ru.home.anna;

public class ColaBottle extends Bottle{
    public ColaBottle() {
        System.out.println("Создали бутылку Колы");
    }

    @Override
    public Bottle copy() {
        Bottle colab = new ColaBottle();
        try {
            colab.pourSoda(getSoda().copy());
        } catch (BottleExeption bottleExeption) {
            bottleExeption.printStackTrace();
        }
        return colab;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hasSoda()) {
            sb.append("Бутылка колы c колой");
        } if (hasLabel()) {
            sb.append(" с этикеткой");
        }if(isSealed()) {
            sb.append(" запечатана.");
        }

        return sb.toString();
    }
}
