package tn.esprit.gestionzoo.entities;

public interface Omnivore <T> extends Carnivor<T> , Herbivore<T> {
    void eatPlantAndMeat(T food) ;
}
