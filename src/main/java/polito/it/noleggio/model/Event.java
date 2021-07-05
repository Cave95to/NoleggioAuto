package polito.it.noleggio.model;

import java.time.LocalTime;

public class Event implements Comparable<Event>{
	
	public enum EventType { // evento ha solo questi 2 tipi, PUBLIC per vederla con simulatore
		NUOVO_CLIENTE,     // sono costanti numeriche 0,1
		RITORNO_AUTO
	}
	
	private LocalTime time ; // quando avviene evento
	private EventType type ; // ha un tipo che definiamo sopra
	
	@Override // definisco come avverrà il confronto tra gli eventi
	public int compareTo(Event other) {
		return this.time.compareTo(other.time) ; // per tempo CRESCENTE, il tempo + basso indica priorita + alta
	}

	public Event(LocalTime time, EventType type) {
		super();
		this.time = time;
		this.type = type;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public EventType getType() {
		return type;
	}

	public void setType(EventType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Event [time=" + time + ", type=" + type + "]";
	}
	
	
	
	
}
