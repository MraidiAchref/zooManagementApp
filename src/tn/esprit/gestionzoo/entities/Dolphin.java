package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    protected float swimmingSpeed ;

    public Dolphin() {
        super();
    }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public void swim(){
        System.out.println("This Dolphin is swimming");
    }

    @Override
    public String toString() {
        return "Dolphin{" + super.toString() +
                "swimmingSpeed=" + swimmingSpeed +
                "} " ;
    }
}
