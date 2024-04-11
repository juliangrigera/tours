package edu.bbdd2;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    protected String producto;
    protected float precio;
    @Id
    private long id;

    public Item() {
    }
    public Item(String producto, float precio) {
        this.producto = producto;
        this.precio = precio;
    }
    public String getProducto() {
        return producto;
    }
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public float getPrecio() {
        return precio;
    }
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    
}
