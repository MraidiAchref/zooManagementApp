package tn.esprit.gestionzoo.entities;

import java.util.Arrays;

public class Zoo {
    private Animal[] animals ;
    private String name ;
    private String city ;

    private int nbrAnimals ;
    final int NBR_CAGE =25;

    private Aquatic[]  aquaticAnimals ;
    private int nbrAquaAnimals ;


    public Zoo(String name, String city ) {
        if (name.isEmpty()) {
            System.out.println("Le nom d’un tn.esprit.gestionzoo.entities.Zoo ne doit pas être vide");
        }else {
            this.animals = new Animal[NBR_CAGE];

            this.name = name;

            this.city = city;

        }
        this.aquaticAnimals = new Aquatic[10] ;
        this.nbrAquaAnimals = 0 ;

    }

    public void displayZoo(){
        System.out.println("name :"+this.name + " city :"+this.city + " nombre des cages :"+this.NBR_CAGE ) ;

    }
    public void displayAnimals(){
        for (int i = 0 ; i< nbrAnimals ; i++) {
            System.out.println(animals[i].toString());
        }
    }

    boolean isZooFull(){
        return nbrAnimals >= NBR_CAGE ;
    }

    public int searchAnimal(Animal animal){
        for (int i = 0 ; i<nbrAnimals ; i++) {

            if ( animals[i].getName().equals(animal.getName())  ){
                return i ;
            }
        }
        return -1 ;
    }


    public boolean addAnimal(Animal animal ){

        if (searchAnimal(animal) != -1 || this.isZooFull()) return false ;
        animals[nbrAnimals++] = animal;
        
        return true ;

    }
    public boolean removeAnimal(Animal animal){
        int searchIndex = searchAnimal(animal) ;
        if (searchIndex != -1) {
            animals[searchIndex] = animals[--nbrAnimals] ;
            animals[nbrAnimals] = null ;
            return true ;
        }else {
            return false ;
        }

    }

    static Zoo comparerZoo(Zoo z1 , Zoo z2 ){

        if(z1.nbrAnimals> z2.nbrAnimals){
            return z1 ;
        }else if (z2.nbrAnimals> z1.nbrAnimals){
            return z2 ;
        }else {
            return null ;
        }
    }
    public void displayNumberOfAquaticsByType(){
        int nbrDolphin =0, nbrPenguin =0 ;
        for (int i =0 ; i<nbrAquaAnimals ; i++) {
            if (aquaticAnimals[i] instanceof Penguin) nbrPenguin++ ;
            else if (aquaticAnimals[i] instanceof Dolphin) nbrDolphin++ ;
        }
        System.out.println("Nombre des dauphins dans le zoo : "+nbrDolphin);
        System.out.println("Nombre des pengouins dans le zoo : "+nbrPenguin);
    }

    public int getNbrAquaAnimals() {
        return nbrAquaAnimals;
    }

    public float maxPenguinSwimmingDepth(){
        float max = 0f ;
        for (Aquatic aquaAnim : aquaticAnimals ){
            if (aquaAnim instanceof Penguin peng && peng.getSwimmingDepth() > max){
                max = peng.getSwimmingDepth() ;
            }
        }
        return max ;
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquatic != null && this.nbrAquaAnimals <10) {
            aquaticAnimals[nbrAquaAnimals++] = aquatic ;
        }
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    @Override
    public String toString() {
        String aquaAnim ="";
        for (Aquatic aqua : aquaticAnimals){
            if (aqua != null){
                aquaAnim += aqua.toString()  +'\n';
            }
        }
        String animalStr ="";
        for (Animal anim : animals){
            if (anim != null){
                animalStr += anim.toString() +'\n' ;
            }
        }
        return "Zoo{" +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages= " + NBR_CAGE +
                animalStr +
                ",\n aquatic animmals =" +aquaAnim+
                '}';
    }

}
