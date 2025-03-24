package com.coudevi.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cuenta_ahorro")
public class CuentaAhorro extends CuentaBancaria {
	private double interes;

	public CuentaAhorro() {
	}

	public CuentaAhorro(String titular, double interes) {
		super(titular);
		this.interes = interes;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}
}
