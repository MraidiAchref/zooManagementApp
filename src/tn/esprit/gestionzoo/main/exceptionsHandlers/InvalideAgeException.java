package tn.esprit.gestionzoo.main.exceptionsHandlers;

import javax.naming.InvalidNameException;

public class InvalideAgeException extends Exception{
    public InvalideAgeException(){
        super();
    }
    public InvalideAgeException(String message) {
        super(message);
    }
}
