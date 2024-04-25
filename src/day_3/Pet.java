package day_3;

public class Pet {
   private String name;
    private int age;
    private PetType tipo;
    private Persona persona;


    public Pet(String name, int age, PetType tipo) {
        this.name = name;
        this.age = age;
        this.tipo = tipo;
    }

    public PetType getTipo() {
        return tipo;
    }

    public void setTipo(PetType tipo) {
        this.tipo = tipo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", tipo=" + tipo +
                '}';
    }
    public void presentacionMascota(){
        System.out.println(name + " es un "+tipo+" y tiene "+ age);
    }
}
