package edu.curso.java.ejemplohibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		//Ejemplo SAVE
		Producto producto1 = new Producto();
		producto1.setNombre("TV LCD 52");
		producto1.setPrecio(4390000.50);
		session.save(producto1);
		System.out.println("Id generado: " + producto1.getId());
		
		//Ejemplo LOAD
		//Long idBuscar = 1L;
		//Producto producto = session.load(Producto.class, idBuscar);
		//System.out.println("Producto recuperado: " + producto.getNombre());
		//producto.setNombre("Nuevo nombre ejemplo");
		
		//Ejemplo UPDATE
		//session.update(producto);
		
		//Ejemplo DELETE
		//session.delete(producto);
		
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
		
	}

}
