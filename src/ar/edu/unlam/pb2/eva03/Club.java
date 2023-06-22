package ar.edu.unlam.pb2.eva03;

import java.util.*;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	private String nombre;
	private Set <Deportista> socios;
	private Map <String, Evento> competencias;
	
	public Club (String nombre) {
		this.nombre = nombre;
		this.socios = new HashSet<>();
		this.competencias = new HashMap<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Deportista> getSocios() {
		return socios;
	}

	public void setSocios(Set<Deportista> socios) {
		this.socios = socios;
	}

	public Map<String, Evento> getCompetencias() {
		return competencias;
	}

	public void setCompetencias(Map<String, Evento> competencias) {
		this.competencias = competencias;
	}
	
	public Boolean agregarDeportista(Deportista deportistaAAgregar) {
		return this.socios.add(deportistaAAgregar);
	}
	
	public Integer getCantidadDeSocios() {
		return this.socios.size();
	}

	public void crearEvento(TipoDeEvento tipoDeEvento, String nombre) {
		Evento eventoNuevo = new Evento (tipoDeEvento, nombre);
		this.competencias.put(nombre, eventoNuevo);
	}
	
	public Evento getEventoPorNombre(String nombreDelEvento) {
		for (Evento evento : competencias.values()) {
			if (evento.getNombre().equals(nombreDelEvento)) {
                return evento;
            }
        }
        return null;
	}

	public Boolean inscribirEnEvento(String nombreDelEvento, Deportista deportistaAInscribir) throws NoEstaPreparado {
		Evento eventoEnElQueSeInscribe = getEventoPorNombre(nombreDelEvento);
		if (eventoEnElQueSeInscribe.elDeportistaPuedeInscribirse(deportistaAInscribir)) {
			eventoEnElQueSeInscribe.agregarParticipante(deportistaAInscribir);
			return true;
		} else throw new NoEstaPreparado();
	}
	
}
