package day_2.models;

import java.util.Arrays;

//modificadores de acceso => public(permite el acceso desde cualquier parte de la app) ||
// private (nos perimte el acceso solo dentro de la misma clase) ||
// default(es cuando no les ponemos nada y podemos acceder desde el mismo paquete) ||
// protected(nos permite el acceso desde el mismo paquuete o desde la clases de hijas)


/*
Nomenclatura= 1.Propiedades
               2. Constructores
               3.Getter y Setters
               4.Metodos que queramos hacer
 */


public class Persona {
   private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    String[] mascota;
    boolean casado;

    public Persona() {
    }


    public Persona(String nombre, String apellido, String dni, int edad, double altura, String[] mascota, boolean casado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
        this.mascota = mascota;
        this.casado = casado;
    }

    //Metodos accesores(tienen que ser public) getter y stters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public String[] getMascota() {
        return mascota;
    }

    public void setMascota(String[] mascota) {
        this.mascota = mascota;
    }

    //al no tener el Static va a ser de cada instacia, osea de cada persona que se vaya generando|| puede o no tener el this. pero es recondendable usarlo
    public void saludarPersona(){
        System.out.println("Hola, me llamo "+ this.nombre);
    }
    //Este se puede instaciar con la clase Persona
    public static void saludar(){
        System.out.println("Hola soy la clase persona");
    }

    //Metodo ToString es para mostrar las propiedadades

    @Override //sobreescribe de manera automatica para que tenga tenga la forma que tiene mi clase(en este caso Persona)
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", mascota=" + Arrays.toString(mascota) +
                ", casado=" + casado +
                '}';
    }
    public void presentacion() {
        System.out.println("Presentacion de  " + nombre + ": ");
        System.out.println("Hola! Mi nombre es "+nombre +" "+ apellido+". ");
        System.out.println("Tengo " + edad + " y mido " + altura + " metros de altura.");
        if (casado){
            System.out.println("Estoy casado/a.");
        }else{
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mi DNI es " + dni);
        System.out.println("Mis mascotas se llaman: ");
        for (String mascota : mascota) {
            System.out.println("- " + mascota);
        }
    }

}
