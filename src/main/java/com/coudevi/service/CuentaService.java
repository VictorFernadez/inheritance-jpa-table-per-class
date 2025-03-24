package com.coudevi.service;

import java.util.List;

import com.coudevi.model.CuentaBancaria;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CuentaService {
	private final EntityManagerFactory emf;

	public CuentaService() {
		this.emf = Persistence.createEntityManagerFactory("herenciaTablePerClassPU");
	}

	public void crearCuenta(CuentaBancaria cuenta) {
		EntityManager em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(cuenta);
			em.getTransaction().commit();
		} finally {
			em.close();
		}
	}

	public List<CuentaBancaria> obtenerCuentas() {
		EntityManager em = emf.createEntityManager();
		try {
			// TABLE_PER_CLASS genera una tabla por cada subclase
			return em.createQuery("SELECT c FROM CuentaBancaria c", CuentaBancaria.class).getResultList();
		} finally {
			em.close();
		}
	}

	public void cerrar() {
		emf.close();
	}
}