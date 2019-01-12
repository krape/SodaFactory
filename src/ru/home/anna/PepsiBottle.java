package ru.home.anna;

public class PepsiBottle extends Bottle{

    public PepsiBottle() {
        System.out.println("Создали бутылку Пепси");
    }

    @Override
    public Bottle copy() {
        Bottle pepsib = new PepsiBottle();
        pepsib.stickLabel(getLabel().copy());
        return pepsib;
    }

    @Override
    public void pourSoda(Soda soda) throws BottleExeption {
        super.pourSoda(soda);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (hasSoda()) {
            sb.append("Бутылка пепси c пепси");
        } if (hasLabel()) {
            sb.append(" с Pepsi этикеткой");
        }if(isSealed()) {
            sb.append(" запечатана синей крышкой.");
        }

        return sb.toString();
    }
}
