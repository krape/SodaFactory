package ru.home.anna;

public abstract class Bottle {
    private Soda soda;
    private Label label;
    private boolean cover = false;


    public Bottle() {
        System.out.println("Создали абстрактную бутылку");
    }

    public void pourSoda(Soda soda) throws BottleExeption {
        if(!isSealed()) {
            this.soda = soda;
        } else {
            throw new BottleExeption("Bottle is already sealed!");
        }
    }

    public void stickLabel(Label label){
        this.label = label;
    }

    public void seal(){
        cover = true;
    }

    public boolean isSealed(){
        return cover;
    }

    public Soda getSoda() {
        return soda;
    }

    public boolean hasSoda() {
        return soda != null;
    }
    public boolean hasLabel(){
        return label != null;
    }

    public Label getLabel() {
        return label;
    }

    public abstract Bottle copy();


}
