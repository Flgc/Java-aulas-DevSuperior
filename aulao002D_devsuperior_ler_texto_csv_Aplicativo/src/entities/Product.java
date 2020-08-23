package entities;

import java.io.Serializable;
								/* Serializable permite que o produto 
								   seja transformado em uma sequencia
								   de bytes */

public class Product implements Serializable {
	
	// Inserido o ID do serializable com a auto correção sugerida
	
	private static final long serialVersionUID = 1L;

	//Campos
	private String name;
	private Double price;
	private Integer quantity;
	
	//Constructor - vazio
	public Product() {		
	}
	
	//Constructors com argumentos - para instânciar os produtos
	public Product(String name, Double price, Integer quantity) {
		super();
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	// Métodos Getters and setters para cada campo
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	//Utilizado para imprimir na tela
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
}
