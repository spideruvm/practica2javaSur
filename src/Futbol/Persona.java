package Futbol;
/*** Clase desarrollada por: Octavio César Escobar Jaramillo ***/
public class Persona {
	
	
	/*Constantes para manejo de IMC*/
	private final double  limiteDesnutricion = 18.5;
	private final double  limiteSobrepeso = 25.0;
	private final int  marcaDesnutricion = -1;
	private final int  marcaNormal = 0;
	private final int  marcaSobrepeso = 1;
	private final char sexoDefault = 'H';
	
	/*Atributos de la clase*/
	private String nombre;
	private int edad;
	private char sexo;
	private double peso;
	private double altura;
	
	
	
	
	/*Constructores*/
	public Persona () {}
	
	public Persona (String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	public Persona (String nombre, int edad, char sexo, double peso, double altura) {
			this.nombre = nombre;
			this.edad = edad;
			this.sexo = sexo;
			this.peso = peso;
			this.altura = altura;
		}
	
	/* Métodos */
	public int calcularIMC(){
		double IMC = (peso / (altura*altura));
		int result = marcaNormal;
		if (IMC < limiteDesnutricion) {
           result = marcaDesnutricion;
		} else if (IMC > limiteSobrepeso) {
			result = marcaSobrepeso;
		}
		return result;
	}
	
	public boolean esMayorEdad(){
		boolean result = true;
		if (edad < 18) {
			result = false;
		}
		return result;
	}
	
	public char comprobarSexo(char sexo){
		char result = sexoDefault;
		if (this.sexo == sexo){
			result = sexo;
		}
		return result;
	}
	
	public String toString() {
		return "Nombre: " + this.nombre + "\n" +
				"Edad: " + this.edad + "\n" +
				"Sexo: " + this.sexo + "\n" +
				"Peso: " + this.peso + "\n" +
				"Altura: " + this.altura + "\n" +
				"Calculo IMC: " + this.calcularIMC() + "\n" +
				"Es mayor edad: " + this.esMayorEdad() +  "\n" + "\n";
	}
	
	/** Métodos "setter" **/
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setEdad(int edad){
			this.edad = edad;
	}
	
	public void setSexo(char sexo){
			this.sexo = sexo;
	}
	
	public void setPeso(double peso){
			this.peso = peso;
	}
	
	public void setAltura(double altura){
			this.altura = altura;
	}
	
	
}