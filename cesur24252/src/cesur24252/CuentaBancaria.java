package cesur24252;

/**
 * 
 * @author Diego Tinedo
 * @version 1.0   
 * @category gestión bancaria
 * 
 * Sistema de gestión de cuentas bancarias
 *
 */

public class CuentaBancaria {

	private String numero;
	private float saldo;
	
	//constructor
	public CuentaBancaria(String numCta, float saldoCta) {
		numero=numCta;
		saldo=saldoCta;
	}

	/**
	 * @return the numero
	 */
	String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the saldo
	 */
	float getSaldo() {
		return saldo;
		//primera modificacion
		//segunda modificacion
		//tercera modificacion
		// cuarta modificacion
		
		
		
		
	}

	/**
	 * @param saldo the saldo to set
	 */
	void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(float importe) {
		saldo=saldo+importe;
	}
	
	public void extraerDinero(float importe) {
		if((saldo-importe)<0) {
			System.out.println("OPERACIoN NO VaLIDA. CUENTA AL DESCUBIERTO");
		}else {
		saldo=saldo-importe;
		}
	}

	public void mostrarCuenta() {
		System.out.println("Nº cuenta" + getNumero());
		System.out.println("Saldo " + getSaldo() +"€");
	}
}
