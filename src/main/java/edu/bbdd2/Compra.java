package edu.bbdd2;

import javax.persistence.*;

@Entity
@Table(name = "compras")
public class Compra {

    @Id
    private long id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cliente_id", referencedColumnName = "id")
    protected Usuario cliente;
    @Column(name = "precio")
    protected float precio;
    
    public Compra() {
    }
    
    public Compra(Usuario cliente, float precio) {
        this.cliente = cliente;
        this.precio = precio;
    }

    public Usuario getCliente() {
        return cliente;
    }
    public void setCliente(Usuario cliente) {
        this.cliente = cliente;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
