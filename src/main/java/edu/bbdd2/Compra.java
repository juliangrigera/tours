package edu.bbdd2;

public class Compra {

    protected Usuario cliente;
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
