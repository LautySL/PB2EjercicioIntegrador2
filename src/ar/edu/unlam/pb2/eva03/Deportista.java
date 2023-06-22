package ar.edu.unlam.pb2.eva03;

import java.util.Objects;

public abstract class Deportista {
	
	private Integer NumeroDeSocio;
	private String nombre;
	
	public Deportista(Integer numeroDeSocio, String nombre) {
		this.NumeroDeSocio = numeroDeSocio;
		this.nombre = nombre;
	}

	public Integer getNumeroDeSocio() {
		return NumeroDeSocio;
	}

	public void setNumeroDeSocio(Integer numeroDeSocio) {
		NumeroDeSocio = numeroDeSocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(NumeroDeSocio);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Deportista other = (Deportista) obj;
		return Objects.equals(NumeroDeSocio, other.NumeroDeSocio);
	}
	
	
	
}
