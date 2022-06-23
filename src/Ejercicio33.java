

public class Ejercicio33 {

	public static void main(String[] args) {
		Tarjeta tarjeta_001 = new Tarjeta("La Caiax", 2100190008, "Alberto Esquivel De Toro", "09/30", 1000, true);
		Tarjeta tarjeta_002 = new Tarjeta("La Caiax", 2100190008, "Alberto Esquivel De Toro", "09/30", 1000, false);
		tarjeta_001.pagoTarjeta(500, tarjeta_001);
		tarjeta_001.pagoTarjeta(1500, tarjeta_002);
	}
}

class Tarjeta{
	// ATRIBUTOS
	String entidadEmisora;
	int numeroTarjeta;
	String titular;
	String fechaCaducidad;
	int saldo;
	boolean estado;
	
	// METODOS GET
	public String getEntidadEmisora() {
		return entidadEmisora;
	}
	
	public int getNumeroTarjeta() {
		return numeroTarjeta;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public boolean isEstado() {
		return estado;
	}
	
	// METODOS SET
	public void setEntidadEmisora(String entidadEmisora) {
		this.entidadEmisora = entidadEmisora;
	}
	
	public void setNumeroTarjeta(int numeroTarjeta) {
		this.numeroTarjeta = numeroTarjeta;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
	// CONSTRUCTORES
	
	public Tarjeta() {
		
	}

	public Tarjeta(String entidadEmisora, int numeroTarjeta, String titular, String fechaCaducidad, int saldo,
			boolean estado) {
		this.entidadEmisora = entidadEmisora;
		this.numeroTarjeta = numeroTarjeta;
		this.titular = titular;
		this.fechaCaducidad = fechaCaducidad;
		this.saldo = saldo;
		this.estado = estado;
	}
	
	// OTROS
	public void tarjetaActiva(Tarjeta tarjeta) {
		if(tarjeta.isEstado() == false) {
			System.out.println("La tarjeta " + tarjeta.numeroTarjeta + " no esta activa. Consulte con su gestor para mas información. ");
		}else {
			System.out.println("Tarjeta lista para su uso.");
		}
	}
	
	public boolean saldoSuficiente(int pago, Tarjeta tarjeta) {
		boolean resultado = true;
		if(pago > tarjeta.saldo && tarjeta.estado == true) {
			System.out.println("Saldo insuficiente");
			resultado = false;
		};
		return resultado;
	}
	
	public void pagoTarjeta(int pago, Tarjeta tarjeta) {
		tarjetaActiva(tarjeta);
		if(tarjeta.saldoSuficiente(pago, tarjeta) == true && tarjeta.estado == true) {
			tarjeta.saldo = tarjeta.saldo - pago;
			System.out.println("Pago realizado. Saldo restante: " + tarjeta.getSaldo() + ". ");
		};
	}
	
}