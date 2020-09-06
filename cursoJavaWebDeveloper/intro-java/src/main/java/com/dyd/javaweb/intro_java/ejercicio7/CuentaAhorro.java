package com.dyd.javaweb.intro_java.ejercicio7;

public class CuentaAhorro extends CuentaBancaria implements IOperacionesBancarias {
	
	private double tasaInteres;

	public CuentaAhorro(String numeroCuenta, String titular, double saldo) {
		super(numeroCuenta, titular, saldo);
	}

	public CuentaAhorro(String numeroCuenta, String titular) {
		super(numeroCuenta, titular);
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	@Override
	public void deposito(double monto) {
		super.saldo += monto;
	}

	@Override
	public void retiro(double monto) {
		this.saldo -= monto;
	}

	@Override
	public String toString() {
		return "CuentaAhorro [tasaInteres=" + tasaInteres + ", numeroCuenta=" + numeroCuenta + ", titular=" + titular
				+ ", saldo=" + saldo + ", estado=" + estado + "]";
	}

	@Override
	public void consultarProducto() {
		// TODO Auto-generated method stub
		
	}
	
}
