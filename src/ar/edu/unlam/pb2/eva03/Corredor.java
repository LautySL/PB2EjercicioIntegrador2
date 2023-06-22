package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor {
	
	private Integer DistanciaPreferida, CantidadDeKilometrosEntrenados;
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer DistanciaPreferida) {
		super(numeroDeSocio, nombre);
		this.DistanciaPreferida = DistanciaPreferida;
	}

	public Integer getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(Integer distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}

	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}

	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}
	
}
