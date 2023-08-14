package br.com.api;

public class HelloWorld {

	private final long id;
	private final String texto;
	
	public HelloWorld(long id, String texto) {
		
		this.id = id;
		this.texto = texto;
	}

	public long getId() {
		return id;
	}

	public String getTexto() {
		return texto;
	}
	
	
}
