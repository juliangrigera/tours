package edu.bbdd2;

import javax.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    private long id;

    @Column(name = "email")
    protected String email;
    @Column(name = "password")
    protected String password;

    public Usuario(){}

    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", email=" + email + ", password=" + password + "]";
    }


}
