package edu.curso.java.ejemplohibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto producto1 = new Producto();
		producto1.setNombre("Notebook LG X123");
		producto1.setPrecio(190000.50);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();
		
		session.save(producto1);
		System.out.println("Id generado: " + producto1.getId());
		
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
		
	}

}
