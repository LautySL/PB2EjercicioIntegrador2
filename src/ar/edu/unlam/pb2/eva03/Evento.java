package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.*;
import ar.edu.unlam.pb2.eva03.interfaces.*;

public class Evento {
	
	private String nombre;
	private TipoDeEvento tipo;
	private Integer numeroDeInscripcion;
	private Map <Integer, Deportista> participantes;
	
	public Evento(TipoDeEvento tipo, String nombre) {
		super();
		this.tipo = tipo;
		this.nombre = nombre;
		this.participantes = new HashMap<Integer, Deportista>();
	}
	
	public Boolean elDeportistaPuedeInscribirse (Deportista deportista) {
		switch (this.tipo) {
		case CARRERA_5K:
			return deportista instanceof ICorredor;
		case CARRERA_10K:
			return deportista instanceof ICorredor;
		case CARRERA_21K:
			return deportista instanceof ICorredor;
		case CARRERA_42K:
			return deportista instanceof ICorredor;
		case DUATLON:
			if (deportista instanceof ICorredor && deportista instanceof ICiclista) {
				return true;
			}
		case CARRERA_NATACION_EN_PICINA:
			return deportista instanceof INadador;
		case CARRERA_NATACION_EN_AGUAS_ABIERTAS:
				if (deportista instanceof INadador) {
					return true;
				} else {
					return false;
				}
		case TRIATLON_SHORT:
			if (deportista instanceof ICorredor && deportista instanceof INadador && 
				deportista instanceof ICiclista) {
				return true;
			}			
		case TRIATLON_OLIMPICO:
			if (deportista instanceof ICorredor && deportista instanceof INadador && 
				deportista instanceof ICiclista) {
				return true;
			}			
		case TRIATLON_MEDIO:
			if (deportista instanceof ICorredor && deportista instanceof INadador && 
				deportista instanceof ICiclista) {
				return true;
			}			
		case TRIATLON_IRONMAN:
			if (deportista instanceof ICorredor && deportista instanceof INadador && 
				deportista instanceof ICiclista) {
				return true;
			}			
		default:
			return false;
		}
	}
	
	public void agregarParticipante (Deportista participante) {
		this.participantes.put(participante.getNumeroDeSocio(), participante);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public TipoDeEvento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeEvento tipo) {
		this.tipo = tipo;
	}

	public Integer getNumeroDeInscripcion() {
		return numeroDeInscripcion;
	}

	public void setNumeroDeInscripcion(Integer numeroDeInscripcion) {
		this.numeroDeInscripcion = numeroDeInscripcion;
	}

	public Map<Integer, Deportista> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(Map<Integer, Deportista> participantes) {
		this.participantes = participantes;
	}
	
	
	
}
