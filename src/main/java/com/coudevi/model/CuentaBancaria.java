package com.coudevi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class CuentaBancaria {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String titular;

	public CuentaBancaria() {
	}

	public CuentaBancaria(String titular) {
		this.titular = titular;
	}

	public Long getId() {
		return id;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
}
