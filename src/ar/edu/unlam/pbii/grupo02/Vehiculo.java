package ar.edu.unlam.pbii.grupo02;

public class Vehiculo {
	private Double latitud;
	private Double longitud;
	
	public Vehiculo(Double latidud,Double longitud) {
		this.latitud=latidud;
		this.longitud=longitud;
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public void actualizarCoordenadas(Double latitud, Double longitud) {
		this.latitud=latitud;
		this.longitud=longitud;
		
	}
}
