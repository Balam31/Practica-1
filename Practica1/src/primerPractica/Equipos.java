package primerPractica;


public class Equipos{
	
	private String equipo;
	
	private int puntos;

	public Equipos() {
	}

	public Equipos(String equipo, int puntos) {
		this.equipo = equipo;
		this.puntos = puntos;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	@Override
	public String toString() {
		return "Equipos [equipo=" + equipo + ", puntos=" + puntos + "]";
	}


	
	
}
