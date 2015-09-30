package Futbol;
public class Aficionado extends Persona {
	
	public EquipoFutbol equipoFavorito;
	public JugadorFutbol jugadorFavorito;
	
	public Aficionado(String nombre, int edad, char sexo, double peso, double altura, 
	                  EquipoFutbol equipoFavorito, JugadorFutbol jugadorFavorito){
		super(nombre,edad,sexo,peso,altura);
		this.equipoFavorito = equipoFavorito;
		this.jugadorFavorito = jugadorFavorito;
	}
	
	public String toString(){
		return("Aficionado:" + "\n" +
		       "Equipo Favorito: " + equipoFavorito.toString() +
		       "Jugador Favorito: " + jugadorFavorito.toString() +
		       super.toString());
	}
}