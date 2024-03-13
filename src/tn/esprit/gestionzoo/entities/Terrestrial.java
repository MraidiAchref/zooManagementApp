package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs ;

    public Terrestrial() {
        super();
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +super.toString()+
                "nbrLegs=" + nbrLegs +
                '}';
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat.equals(Food.MEAT)){
            System.out.println("La viande est délicieuse !");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant.equals(Food.PLANT)){
            System.out.println("miam plante fraiche !");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if(food.equals(Food.BOTH)){
            System.out.println("la5dher w el yebes =D ");
        }
    }
}
