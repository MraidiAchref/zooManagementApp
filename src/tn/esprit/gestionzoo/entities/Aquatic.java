package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public abstract class Aquatic extends Animal implements Carnivor<Food> {
    protected String habitat ;
    public Aquatic(){
        super();
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;

    }

    public abstract void swim() ;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return this.habitat.equals(aquatic.habitat) &&
                this.age == aquatic.age &&
                this.name.equals(aquatic.name) ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(habitat);
    }

    @Override
    public String toString() {
        return "Aquatic{" +super.toString() +
                "habitat='" + habitat + '\'' +
                '}';
    }
}
