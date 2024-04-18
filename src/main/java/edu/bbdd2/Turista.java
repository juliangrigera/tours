package edu.bbdd2;

import javax.persistence.Entity;

@Entity
public class Turista extends Usuario{

    protected String telefono;

    public Turista() {
    }

    public Turista(String email, String password, String telefono) {
        super(email, password);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
}
