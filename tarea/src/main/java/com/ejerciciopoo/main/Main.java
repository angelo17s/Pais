package com.ejerciciopoo.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.ejerciciopoo.entidades.Cliente;
import com.ejerciciopoo.entidades.Pais;




public class Main {
	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	

	public static void main(String[] args) {
		Pais pais= new Pais("Turquia");
		ingresarPais(pais);
		
		Cliente persona= new Cliente("Angelo","Silva","Pincay",pais);
		ingresarPersona(persona);
		
		
		
		

		
	}
	static void ingresarPersona(Cliente persona) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarPais(Pais pais) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pais);
		session.getTransaction().commit();
		session.close();

	}
	
	
	


}
