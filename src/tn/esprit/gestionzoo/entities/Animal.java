package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family ;
    protected String name ;
    protected int age ;
    protected boolean isMammal ;

    public Animal() {
    }

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

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {

        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }
}
