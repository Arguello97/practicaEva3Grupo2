package ar.edu.unlam.pbii.grupo02;

public class Tren extends Vehiculo{

	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;

	public Tren(Integer vagones,Integer pasajerosPorVagon, Integer velocidadMaxima,Double latidud, Double longitud) {
		super(latidud, longitud);
		this.cantidadDeVagones=vagones;
		this.cantidadDePasajerosPorVagon=pasajerosPorVagon;
		this.velocidadMaxima=velocidadMaxima;
		
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	public void setCantidadDePasajerosPorVagon(Integer cantidadDePasajerosPorVagon) {
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
	}

	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(Integer velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	

}
