package day_3;

import java.util.*;

public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private double altura;
    private boolean casado;
    private Set<Pet> mascotas = new HashSet<>();


    public Persona() {

    }

    public Persona(String nombre, boolean casado, double altura, int edad, String dni, String apellido) {
        this.nombre = nombre;
        this.casado = casado;
        this.altura = altura;
        this.edad = edad;
        this.dni = dni;
        this.apellido = apellido;
    }

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

    public boolean isCasado() {
        return casado;
    }

    public void setCasado(boolean casado) {
        this.casado = casado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Set<Pet> getMascotas() {
        return mascotas;
    }

    public void setMascotas(Set<Pet> mascotas) {
        this.mascotas = mascotas;

    }


    //Metodo para agregar mascotas
    public void addPet(Pet mascota) {
        mascota.setPersona(this);//this=> hace referencia  la persoan
        this.mascotas.add(mascota);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", dni='" + dni + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", casado=" + casado +
                ", mascotas=" + mascotas +
                '}';
    }

    public void presentacion() {
        System.out.println("Presentacion de  " + nombre + ": ");
        System.out.println("Hola! Mi nombre es " + nombre + " " + apellido + ". ");
        System.out.println("Tengo " + edad + " y mido " + altura + " metros de altura.");
        if (casado) {
            System.out.println("Estoy casado/a.");
        } else {
            System.out.println("No estoy casado/a.");
        }
        System.out.println("Mi DNI es " + dni);
        System.out.println("Mis mascotas se llaman: ");
        for (Pet mascota : mascotas) {
            System.out.println(" -" + mascota.getName() + " es un " + mascota.getTipo() + " y tiene  " + mascota.getAge() + " años");
        }

    }
}
