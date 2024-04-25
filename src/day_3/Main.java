package day_3;

public class Main {

    public static void main(String[] args) {
        Pet mascotas = new Pet("Leon", 14, PetType.PERRO);
        System.out.println(mascotas);

        Persona persona = new Persona("Flor", false, 1.58, 28, "55514652", "Ayala");
        System.out.println(persona);

        persona.addPet(mascotas);
        System.out.println(persona);
        persona.presentacion();

        Persona mayco = new Persona("Mayco", false, 1.90, 22, "55455821", "Dominguez");
        Pet mascotasMayco = new Pet("Toby", 11, PetType.PERRO);
        mayco.addPet(mascotasMayco);
        mayco.presentacion();


    }


}
