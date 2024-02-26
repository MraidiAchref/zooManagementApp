package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

import java.util.Arrays;
import java.util.Scanner;

public class ZooManagement {
    public static void  main(String args[]){

        Dolphin doufa = new Dolphin("doufa", "a7la", 8, true, "banzart", 46);
        Penguin batrik = new Penguin("Spheniscidae", "HappyFeet", 3, false, "Antarctica", 2.5f);
        Penguin samir = new Penguin("Spheniscidae", "HappyFeet", 3, false, "Antarctica", 10f);
        Penguin malouli = new Penguin("Spheniscidae", "HappyFeet", 3, false, "Antarctica", 1f);
        Terrestrial bagra = new Terrestrial("vache","halouba",6,true,4);


        Aquatic bahouri = new Aquatic("blues","qlq",14,false,"houma") ;
        //bahouri.swim();
        //doufa.swim();
        //bahouri.swim();


        Zoo myZoo = new Zoo("belveder","tunis");
        myZoo.addAquaticAnimal(bahouri);
        myZoo.addAquaticAnimal(doufa);
        myZoo.addAquaticAnimal(batrik);
        myZoo.addAquaticAnimal(samir);
        myZoo.addAquaticAnimal(malouli);


        for (int i =0 ; i< myZoo.getNbrAquaAnimals();i++){
            System.out.println(myZoo.getAquaticAnimals()[i]) ;
        }
        System.out.println( myZoo.maxPenguinSwimmingDepth() ) ;
        myZoo.displayNumberOfAquaticsByType();
        //System.out.println( Arrays.toString(myZoo.getAquaticAnimals()) );
        //System.out.println(myZoo);
        System.out.println(malouli.equals(samir));


    }
}
