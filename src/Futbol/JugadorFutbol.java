package Futbol;
public class JugadorFutbol extends Persona {
	
	public EquipoFutbol nombreEquipo;
	
	public JugadorFutbol (String nombre, int edad, char sexo, double peso, double altura, String nombreEquipo){
		super(nombre,edad,sexo,peso,altura);
		this.nombreEquipo = new EquipoFutbol(nombreEquipo);
	}
	
	public JugadorFutbol (String nombre, int edad, char sexo, double peso, double altura, EquipoFutbol nombreEquipo){
			super(nombre,edad,sexo,peso,altura);
			this.nombreEquipo = nombreEquipo;
		}
	
	public String toString(){
		return "Equipo donde milita: " + nombreEquipo.toString() + super.toString(); 
	}	
}