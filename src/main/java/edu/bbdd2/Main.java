package edu.bbdd2;

import javax.persistence.EntityManager;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {
    private static SessionFactory factory;
    public static void main(String[] args) {
        
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();

        factory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
        Usuario pablo = new Usuario("pablo@bbdd2.edu","p4bl0");
        EntityManager manager = factory.createEntityManager();
        manager.getTransaction().begin();
        manager.persist(pablo);
        manager.getTransaction().commit();




    }
}