package tn.esprit.gestionzoo.main.exceptionsHandlers;

public class ZooFullException extends Exception{
    public ZooFullException(){
        super();
    }
    public ZooFullException(String message){
        super(message);
    }
}
