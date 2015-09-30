package Futbol;

public class TestModeloClasico {
	public static void main(String[] args) {
		/*** Creación de objeto EquipoFutbol ***/
		EquipoFutbol equipo1 = new EquipoFutbol("América");
		/*** Creación de 2 objetos JugadorFutbol usando las dos posibilides de constructor ***/
		JugadorFutbol jugador1Equipo1 = new JugadorFutbol ("Carlos Reynoso",50,'M',80,1.65,"América");
		JugadorFutbol jugador2Equipo1 = new JugadorFutbol ("Cuauhtemoc Blanco",41,'M',90,1.70,equipo1);

       /*** Creación de segundo objeto EquipoFutbol ***/
		EquipoFutbol equipo2 = new EquipoFutbol("Chivas");
		JugadorFutbol jugador1Equipo2 = new JugadorFutbol ("Zuly Ledezma",55,'M',75,1.75,equipo2);
		
		/*** Creación y llenado del arreglo ***/
		Persona asistentesClasico [] = new Persona[5];
		asistentesClasico[0]= new Aficionado("Chepo de la Torre",45,'M',75,1.80,equipo1,jugador1Equipo2);
		asistentesClasico[1]= new Aficionado("José Ramón Fernández",70,'M',77,1.68,equipo1,jugador2Equipo1);
		asistentesClasico[2]= new Aficionado("Miley Cyrus",24,'F',60,1.63,equipo1,jugador1Equipo1);
		asistentesClasico[3]= jugador1Equipo1;
		asistentesClasico[4]= new JugadorFutbol ("Luis García",47,'M',73,1.70,"América");
		
		int ciclo = 0;
		for (ciclo=0; ciclo<asistentesClasico.length; ciclo++){
			System.out.println("Localidad " + ciclo);
			System.out.println(asistentesClasico[ciclo].toString());
			System.out.println("-------------------------------------------------");
		}
		
	}
}