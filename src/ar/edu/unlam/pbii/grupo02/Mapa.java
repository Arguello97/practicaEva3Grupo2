package ar.edu.unlam.pbii.grupo02;

import java.util.HashSet;

public class Mapa {

	private String nombre;
	private HashSet<Vehiculo> vehiculos;

	public Mapa(String nombre) {
		this.nombre=nombre;
		this.vehiculos=new HashSet<Vehiculo>();
		
	}
	

	public HashSet<Vehiculo> getVehiculos() {
		return vehiculos;
	}


	public void setVehiculos(HashSet<Vehiculo> vehiculos) {
		this.vehiculos = vehiculos;
	}


	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarVehiculo(Vehiculo vehiculoAAgregar) {
		return vehiculos.add(vehiculoAAgregar);
		
	}


	public Integer getCantidadDeVehiculos() {
		return vehiculos.size();
	}


	public Boolean hayCoalicion() throws ColitionException{
		Boolean huboColicion=false;
		for(Vehiculo i:vehiculos) {
			for(Vehiculo j:vehiculos) {
				if(i!=j && i.getLatitud().equals(j.getLatitud()) && i.getLongitud().equals(j.getLongitud())) {
					huboColicion=true;
					throw new ColitionException();
			}
		}
	}
		return huboColicion;
	}

}

