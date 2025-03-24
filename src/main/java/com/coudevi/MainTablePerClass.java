package com.coudevi;

import com.coudevi.model.CuentaAhorro;
import com.coudevi.model.CuentaCorriente;
import com.coudevi.service.CuentaService;

public class MainTablePerClass {

	public static void main(String[] args) {
		CuentaService service = new CuentaService();

		CuentaAhorro cAhorro = new CuentaAhorro("Carlos Ahorro", 0.02);
		CuentaCorriente cCorriente = new CuentaCorriente("María Corriente", 500.0);

		service.crearCuenta(cAhorro);
		service.crearCuenta(cCorriente);

		service.obtenerCuentas().forEach(c -> {
			System.out.println("Cuenta ID: " + c.getId() + " - " + c.getClass().getSimpleName());
			if (c instanceof CuentaAhorro) {
				CuentaAhorro a = (CuentaAhorro) c;
				System.out.println("  Titular: " + a.getTitular() + ", Interés: " + a.getInteres());
			} else if (c instanceof CuentaCorriente) {
				CuentaCorriente cc = (CuentaCorriente) c;
				System.out.println("  Titular: " + cc.getTitular() + ", Descubierto: " + cc.getDescubierto());
			}
		});

		service.cerrar();
	}

}
