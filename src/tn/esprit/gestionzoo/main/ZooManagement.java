package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

import java.util.Scanner;

public class ZooManagement {
    public static void  main(String args[]){
        Scanner scan = new Scanner(System.in) ;

        Zoo myZoo = new Zoo("belveder","tunis");
        Zoo myZoo2 = new Zoo("chami","tozeur");
        Zoo emptyZoo = new Zoo(" ","empty") ;

        Animal lion = new Animal("carniv","",15,true) ;
        Animal loup = new Animal("carniv","thib",16,true) ;
        Animal canard = new Animal("herbiv","batout",2,false) ;




        myZoo.addAnimal(loup);
        myZoo.addAnimal(canard) ;
        System.out.println(myZoo.addAnimal(new Animal("carniv","",14,false)));
        System.out.println(myZoo.removeAnimal(loup));
        System.out.println(myZoo);
    }
}
