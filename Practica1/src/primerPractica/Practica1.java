package primerPractica;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Practica1{

	public static void main(String[] args) {
		
		System.out.println("Tabla de Equipos");
		System.out.print("Ingresa el numero de equipos: ");
		Scanner sc = new Scanner(System.in);
		int numequipos, puntos;
		String equipo;
		numequipos = sc.nextInt();
		
		Equipos equiposTabla[] = new Equipos[numequipos];
		
		for(int i=0; i<equiposTabla.length; i++) {
			sc.nextLine();
			System.out.println("Nombre del equipo: " + (i+1));
			equipo =sc.nextLine();
			
			System.out.println("Ingresa los puntos del equipo " +(i+1));
			puntos = sc.nextInt();
			
			equiposTabla[i] = new Equipos(equipo, puntos);
			equiposTabla[i].setEquipo(equipo);
			equiposTabla[i].setPuntos(puntos);
		}
		
		List<Equipos> misEquipos = Arrays.asList(equiposTabla);
		
		Collections.sort(misEquipos, new Comparador());
		Collections.reverse(misEquipos);
		
		for(int i=0; i<equiposTabla.length; i++) {
		System.out.println("Equipo: " + equiposTabla[i].getEquipo() + " Puntos: " + equiposTabla[i].getPuntos());
		}
		
		
		sc.close();


	}

}
