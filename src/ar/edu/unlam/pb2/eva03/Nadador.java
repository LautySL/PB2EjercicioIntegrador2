package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.EstiloPreferido;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador {
	
	private String nombre;
	private EstiloPreferido EstiloPreferido;
	
	public Nadador(Integer numeroDeSocio, String nombre, EstiloPreferido EstiloPreferido) {
		super(numeroDeSocio, nombre);
		this.EstiloPreferido = EstiloPreferido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public EstiloPreferido getEstiloPreferido() {
		return EstiloPreferido;
	}

	public void setEstiloPreferido(EstiloPreferido estiloPreferido) {
		EstiloPreferido = estiloPreferido;
	}
	
	

}
