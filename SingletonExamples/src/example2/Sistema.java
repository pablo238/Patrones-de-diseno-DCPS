package example2;

public class Sistema {
	private static Sistema sistema=new Sistema();
	private String hora="00:00";
	
	private Sistema() {}
	
	public static Sistema getInstance() {
		return sistema;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}
}
