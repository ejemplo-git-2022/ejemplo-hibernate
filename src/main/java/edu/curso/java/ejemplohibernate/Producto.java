package edu.curso.java.ejemplohibernate;

import javax.persistence.*;



@Entity
@Table(name = "productos")
public class Producto {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(name = "nombre_producto")
	private String nombre;
	
	private Double precio;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	
}
