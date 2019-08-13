package example1;

public class ElPapa {
	private String nombre;
	private static ElPapa elPapa;
	
	private ElPapa() {
	}
	
	public static synchronized ElPapa getInstance() {
		if (elPapa == null) {
			elPapa=new ElPapa();
		}
		return elPapa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
}
