package edu.bbdd2;

import java.util.List;
import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    private static SessionFactory factory;
    public static void main(String[] args) {
        
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
        factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        EntityManager manager = factory.createEntityManager();

        Usuario pablo = new Usuario("pablo@bbdd2.edu","p4bl0");
        Usuario ana = new Usuario("ana@bbdd2.edu","4n4");
        Compra compra = new Compra(ana,10000);

        Session session = factory.openSession();
        manager.getTransaction().begin();
        manager.persist(compra);
        manager.getTransaction().commit();

        Session sessionFetch = factory.openSession();
        manager.getTransaction().begin();
        List<Compra> compras = sessionFetch.createQuery("from Compra").getResultList();
        System.out.println(compras.get(0).getCliente());
        manager.getTransaction().commit();

    }
}