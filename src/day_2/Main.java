package day_2;

import day_2.models.Persona;

public class Main {
    public static void main(String[] args) {
       // Persona persona = new Persona();
        //como esta private tengo que ponnerle los setters||los setters me sirven tanto como para asignarle un valor como para modificarlo
        //aca estaria usando el constructor de persona vacio
     //   persona.setNombre("Flor");
       // persona.setApellido("Ayala");
       // persona.setEdad(28);

        //System.out.println(persona);

       // Persona.saludar();//tiene el public static void|| es un metodo de la clase
       // persona.saludarPersona();//tiene el public void||es un metodo de los objetos

    //aca estaria usando el constructor que tiene los parametros
//        String[] mascotas = {"Tito","Luca"};
//        Persona persona2 = new Persona("carla","Toledo","D-520215",28,1.70,mascotas,true);
//        System.out.println(persona2);
       /// System.out.println(persona2);
        String[] mascotas = {"Leon", "Coca", "Puky"};
        Persona persona = new Persona("Flor","Ayala","254155884",28,1.58,mascotas,false);
        persona.presentacion();

        System.out.println();
        Persona amigo = new Persona("Angela", "Diaz","55485634",26,1.70,mascotas,true);
        amigo.presentacion();
    }
}
