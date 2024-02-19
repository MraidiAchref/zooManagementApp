package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Scanner;

public class ZooManagement {
    public static void  main(String args[]){

        Dolphin doufa = new Dolphin("doufa", "a7la", 8, true, "banzart", 46);
        Penguin batrik = new Penguin("Spheniscidae", "HappyFeet", 3, false, "Antarctica", 2.5f);
        Terrestrial bagra = new Terrestrial("vache","halouba",6,true,4);
        System.out.println(batrik);
        System.out.println(doufa);
        System.out.println(bagra);

        Aquatic bahouri = new Aquatic("blues","qlq",14,false,"houma") ;
        bahouri.swim();
        doufa.swim();
        bahouri.swim();
        /*
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

         */
    }
}
