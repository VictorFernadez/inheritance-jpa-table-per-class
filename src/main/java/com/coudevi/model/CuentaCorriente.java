package com.coudevi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_corriente")
public class CuentaCorriente extends CuentaBancaria {
	private double descubierto;

	public CuentaCorriente() {
	}

	public CuentaCorriente(String titular, double descubierto) {
		super(titular);
		this.descubierto = descubierto;
	}

	public double getDescubierto() {
		return descubierto;
	}

	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
}
