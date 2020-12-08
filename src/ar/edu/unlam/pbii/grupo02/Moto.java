package ar.edu.unlam.pbii.grupo02;

public class Moto extends Vehiculo{

	private String patente;
	private Integer velocidadMaxima;
	private final Integer CANTIDAD_MAXIMA_DE_PASAJEROS;

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public Integer getCANTIDAD_MAXIMA_DE_PASAJEROS() {
		return CANTIDAD_MAXIMA_DE_PASAJEROS;
	}

	public Moto(String patente, Integer velocidadMaxima, Double latidud, Double longitud) {
		super(latidud, longitud);
		this.patente=patente;
		this.velocidadMaxima=velocidadMaxima;
		this.CANTIDAD_MAXIMA_DE_PASAJEROS=2;
		
	}

}
