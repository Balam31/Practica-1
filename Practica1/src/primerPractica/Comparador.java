package primerPractica;

import java.util.Comparator;

public class Comparador  implements Comparator<Equipos> {
	
	@Override
	public int compare(Equipos equipo1, Equipos equipo2) {
		
		int respuesta = 0;
		
		if(equipo1.getPuntos() > equipo2.getPuntos()) {
			respuesta = 1;
		} else if(equipo1.getPuntos() < equipo2.getPuntos()) {
			respuesta=-1;
		} else respuesta = 0;
		
		return respuesta;
		
	}
}
