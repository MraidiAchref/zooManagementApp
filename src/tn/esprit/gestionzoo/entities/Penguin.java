package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth ;

    public Penguin() {
        super();
    }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }
    @Override
    public void swim(){
        System.out.println("This Penguin is swimming");
    }

    @Override
    public String toString() {
        return "Penguin{" +super.toString() +
                "swimmingDepth=" + swimmingDepth +
                '}';
    }
}
