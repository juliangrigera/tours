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

        Turista pablo = new Turista("pablo@bbdd2.edu","p4bl0", "1144332222");
        Turista ana = new Turista("ana@bbdd2.edu","4n4", "2214443213");
        Guia mariana = new Guia("mariana@bbdd2.edu", "m4r1", "Trekking");
        Compra compra = new Compra(ana,10000);
        Item excursion = new Item("Excursión al Lago Escondido", 15000);

        Session session = factory.openSession();
        manager.getTransaction().begin();
        manager.persist(mariana);
        manager.persist(pablo);
        manager.persist(excursion);
        compra.agregarItem(excursion);
        manager.persist(compra);
        manager.getTransaction().commit();

        Session sessionFetch = factory.openSession();
        manager.getTransaction().begin();
        List<Compra> compras = sessionFetch.createQuery("from Compra").getResultList();
        System.out.println(compras.get(0).getCliente());

        List<Usuario> usuarios = sessionFetch.createQuery("from Usuario").getResultList();
        usuarios.forEach(usuario -> {
            System.out.println(usuario);
        });
        manager.getTransaction().commit();

    }
}