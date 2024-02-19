package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family ;
    private String name ;
    private int age ;
    private boolean isMammal ;

<<<<<<< HEAD
    public Animal() {
    }

=======
>>>>>>> 46297305998348ba92be8310d22d767b2979d195
    public Animal(String family,
                  String name,
                  int age,
                  boolean isMammal) {
        if (age < 0 ) {
            System.out.println("Un animal ne peut pas avoir un âge négatif ");
        }else {
            this.family = family;
            this.name = name;
            this.age = age;
            this.isMammal = isMammal;
        }

    }
    public String getName(){
        return this.name ;
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
