package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat ;
    public Aquatic(){
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }
    @Override
    public String toString() {
        return "Aquatic{" +super.toString() +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
