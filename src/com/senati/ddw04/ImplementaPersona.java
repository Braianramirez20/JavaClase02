package com.senati.ddw04;

public class ImplementaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona Gerente = new Persona();
		Gerente.id= 1;
		Gerente.nombre="Juan";
		Gerente.apellido="Garcia";
		Gerente.sexo="Varon";
		Gerente.fnacimiento="10/01/81";
		
		System.out.println("Datos registrados");
		System.out.println(Gerente.toString());
		
		Persona Obrero1 = new Persona();
		Obrero1.id=2;
		Obrero1.nombre="Jeferson";
		Obrero1.apellido="Cortez";
		Obrero1.sexo="Hombre";
		Obrero1.fnacimiento="20/02/00";
		
		System.out.println("Datos registrados");
		System.out.println(Obrero1.toString());
		
		Persona Obrero2 = new Persona();
		Obrero2.id=3;
		Obrero2.nombre="Daniel";
		Obrero2.apellido="Ramos";
		Obrero2.sexo="Hombre";
		Obrero2.fnacimiento="12/08/00";
		
		System.out.println("Datos registrados");
		System.out.println(Obrero2.toString());
		
		Persona Obrero3 = new Persona();
		Obrero3.id=4;
		Obrero3.nombre="Jean";
		Obrero3.apellido="Mattos";
		Obrero3.sexo="Hombre";
		Obrero3.fnacimiento="15/07/00";
		
		System.out.println("Datos registrados");
		System.out.println(Obrero3.toString());
		
		Persona Obrero4 = new Persona();
		Obrero4.id=5;
		Obrero4.nombre="Alexis";
		Obrero4.apellido="Gomez";
		Obrero4.sexo="Hombre";
		Obrero4.fnacimiento="14/09/00";

		System.out.println("Datos registrados");
		System.out.println(Obrero4.toString());
		
		Persona Obrero5 = new Persona();
		Obrero5.id=5;
		Obrero5.nombre="Cristian";
		Obrero5.apellido="Bernal";
		Obrero5.sexo="Hombre";
		Obrero5.fnacimiento="23/09/00";
		
		System.out.println("Datos registrados");
		System.out.println(Obrero5.toString());
		
	}
	

}
