package edu.bbdd2;

import javax.persistence.*;

@Entity
public class Guia extends Usuario{
    protected String especialidad;
    
    public Guia(){}

    public Guia(String email, String password, String especialidad) {
        super(email, password);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    
}
