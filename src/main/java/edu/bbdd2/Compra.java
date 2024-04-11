package edu.bbdd2;

import java.util.ArrayList;
import java.util.List;
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

    @OneToMany
 	protected List<Item> items = new ArrayList<Item>();
    
    public Compra() {
    }
    
    public Compra(Usuario cliente, float precio) {
        this.cliente = cliente;
        this.precio = precio;
    }

    public void agregarItem(Item item){
        this.items.add(item);
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
