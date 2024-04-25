package day_1;

import java.util.Scanner;

public class Main {
   public static void main(String[]args){
      // System.out.println("hello word");

       /*
       EJERCICIO 1
       Crea las variables correspondientes para leer tu nombre, apellido y
       edad e imprímelas en la consola en una oración.

       Scanner prompt = new Scanner(System.in);

       System.out.println("Ingrese el nombre: ");
       String nombre = prompt.next();

       System.out.println("Ingrese el apellido: ");
       String apellido =prompt.next();

       System.out.println("Ingrese la edad: ");
       byte edad = prompt.nextByte();

       System.out.println("Hola, me llamo " + nombre +" "+ apellido+" y tengo " + edad + " años");
       */


     /*
     LLAMADO DEL EJ 2
      saludo();
      */


       /*
       Ejercicio 3
    Crea un pequeño programa que te permita ingresar 3 números e imprimir a través de la consola cuál es el más grande.
      Scanner prompt = new Scanner(System.in);
       System.out.println("Ingrese el primer numero: ");
       int numero1 = prompt.nextInt();

       System.out.println("Ingrese el segundo numero: ");
       int numero2 = prompt.nextInt();

       System.out.println("Ingrese el tercer numero: ");
       int numero3 = prompt.nextInt();

       if(numero1 > numero2 && numero1 > numero3) {
           System.out.println("El numero 1 es mayor que el segundo y el tercer numero");
       } else if (numero1 < numero2 && numero2 > numero3) {
           System.out.println("el segundo numero es mayor que el primero y el terccero");

       } else if (numero1< numero3 && numero2 < numero3) {
           System.out.println("el tercer numero es mayor que el primer y segundo numero");
       }else {
           System.out.println("Los tres numeros ingresados son iguales");
       }
     */

       /*
       Ejercicio 4
       Crea un pequeño programa que te permita ingresar un número e imprimir a través de la consola si es par o impar.

       Scanner prompt = new Scanner(System.in);
       System.out.println("Ingrese un numero: ");
       int numero = prompt.nextInt();
       if(numero % 2== 0){
           System.out.println("el numero ingreaso es par");
       }else {
           System.out.println("El numero ingrasado es impar");
       }
    */
       /*
       Ejercicio 5
       Crea el código correspondiente que te permite ingresar 2 cadenas de caracteres e imprimir vía consola si son iguales o no.

       Scanner prompt = new Scanner(System.in);
       System.out.println("Ingrese la primera cadena de caracteres: ");
       String cadena1 =prompt.nextLine();

       System.out.println("Ingrese la segunda cadena de caracteres: ");
       String cadena2 = prompt.nextLine();
        if(cadena1.equals(cadena2)){
            System.out.println("La cadena 1 es mas grande que la segunda");
        }else {
            System.out.println("La segunda cadena es mas grande que la primera");
        }
        */
        /*
        Ejercicio 6
        Cree un método que reciba un número y devuelva si es primo o no.
        los numero primos son los numeros que se dividen por si mismo y por uno/// terminar!! y pasarlo a metodo
         */
       /*

        int numeroPrim = 19;
        if (esPrimo(numeroPrim)) {
            System.out.println(numeroPrim + " es primo.");
        } else {
            System.out.println(numeroPrim + " no es primo.");
        }
          // Método para verificar si un número es primo
           public static boolean esPrimo(int numero) {
               if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
           }

       }
        */
       //Llamado al ej 7
    //declaracionMatriz();
       /*
       LLADO AL METODO DE LA 9/10
        calculadora();
        */
    //boleteria();

   }
   /*
   Ejercicio 2
   Cree un método que imprima un mensaje de bienvenida en la consola.
    */
    public static void saludo(){

        System.out.println("Hola, bienvendos a todos!");
    } ;

    /*
     Ejercicio 7
    Cree un método que reciba una matriz de números y devuelva la suma de los números impares.
     */

/*
    public static int declaracionMatriz(){
        int matriz[][]= {{1,1,2},{8,6,9},{2,4,3}};//matriz 3*3
        int suma =0;
        //un for anidado dentro de otro for para recorrer la matriz, ya que se necesitan los 2 indices de la matriz para poder hacerlo
        for (int i = 0; i < 3; i++) { //i<3 es el numero de filas
            for (int j = 0; j < 3; j++) {//J<3 es el numero de columnas
                System.out.println(matriz[i][j]);
                if (matriz[i][j] % 2 != 0) {
                    suma += matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("El resultado de los numeros impares es: " + suma);
        return suma;
    }
 */
    /*
    Ejercicio 8
    Cree un método que reciba una matriz de números e imprima los números pares y la suma de los números primos.//NUMEROS PRIMOS!TERMINAR

    public static int declaracionMatriz(){
        int matriz[][]= {{1,3,2},{8,6,9},{2,4,3}};//matriz 3*3
        int primos =0;
        //un for anidado dentro de otro for para recorrer la matriz, ya que se necesitan los 2 indices de la matriz para poder hacerlo
        for (int i = 0; i < 3; i++) { //i<3 es el numero de filas
            for (int j = 0; j < 3; j++) {//J<3 es el numero de columnas
                System.out.println(matriz[i][j]);
                if (matriz[i][j] % 2 == 0) {
                    primos= matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("El resultado de los numeros impares es: " + primos);
        return primos;
    }

    /*
    Ejercicio 9
   Crear un método que imprima un pequeño menú a través de la consola con las opciones básicas de una calculadora, agregando la opción 0 para salir de ella.
     */

    public static void calculadora() {
            Scanner prompt = new Scanner(System.in);
            int opcion;

            do {
                System.out.println("Ingrese su numero de opcion para la calculadora: ");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicacion");
                System.out.println("4. Division");
                System.out.println("0. Salir");

                opcion = prompt.nextInt();
                int numero1, numero2, resultado;

                switch (opcion) {
                    case 0:
                        System.out.println("saliendo");
                        break;
                    case 1:
                        System.out.print("Ingrese el primer numero: ");
                        numero1 = prompt.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        numero2 = prompt.nextInt();
                        resultado = numero1 + numero2;
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 2:
                        System.out.print("Ingrese el primer numero: ");
                        numero1 = prompt.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        numero2 = prompt.nextInt();
                        resultado = numero1 - numero2;
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 3:
                        System.out.print("Ingrese el primer numero: ");
                        numero1 = prompt.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        numero2 = prompt.nextInt();
                        resultado = numero1 * numero2;
                        System.out.println("La suma es: " + resultado);
                        break;
                    case 4:
                        System.out.print("Ingrese el primer numero: ");
                        numero1 = prompt.nextInt();
                        System.out.print("Ingrese el segundo numero: ");
                        numero2 = prompt.nextInt();
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                            System.out.println("La division es: " + resultado);
                        } else {
                            System.out.println("No se puede dividir por cero");
                        }
                        break;

                    default:
                        System.out.println("Error, vuelva a ingresar otra opcion!");
                        break;
                }
            } while (opcion != 0);

        }
/*
        public static void boleteria(){
            Scanner prompt = new Scanner(System.in);
            int opcion ;
            opcion = prompt.nextInt();
            do{
                System.out.println("1. Suma");
                System.out.println("2. Capacidad");
                System.out.println("3. Dinero recaudado");
                switch (opcion) {
                    case 1:
                        System.out.println("caso 1");
                        break;
                    case 2:
                        System.out.println("caso 2");
                        break;
                    case 3:
                        System.out.println("caso 3");
                        break;
                }


            }while (opcion != 0);//cerrar seson
            prompt.close();
        }
        /*
        import java.util.Scanner;

public class Bolera {

    private static final int CAPACIDAD_MAXIMA = 500;
    private static final double PRECIO_ENTRADA_NORMAL = 1500.0;
    private static final double PRECIO_ENTRADA_VIP = 2000.0;

    private static int aforoActual = 0;
    private static double dineroRecaudado = 0.0;
    private static boolean sesionActiva = true;

    // Método para imprimir el menú de la bolera
    public static void imprimirMenu() {
        System.out.println("---- Bolera ----");
        System.out.println("1. Entrada de datos");
        System.out.println("2. Consultar capacidad disponible");
        System.out.println("3. Consultar dinero recaudado");
        System.out.println("4. Cerrar sesión en el sistema");
        System.out.print("Ingrese su opción: ");
    }

    // Método para realizar todas las funcionalidades de la bolera
    public static void gestionarBolera(Scanner scanner) {
        int opcion;
        do {
            imprimirMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("---- Datos del participante ----");
                    System.out.print("Nombre: ");
                    String nombre = scanner.next();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    System.out.print("DNI: ");
                    String dni = scanner.next();
                    System.out.print("¿Tiene pase VIP? (s/n): ");
                    boolean tienePaseVIP = scanner.next().equalsIgnoreCase("s");

                    if (edad >= 21) {
                        if (tienePaseVIP) {
                            System.out.println("¡Bienvenido, " + nombre + "! Puedes ingresar gratis como VIP.");
                            aforoActual++;
                        } else {
                            System.out.print("¿Tiene pase con descuento? (s/n): ");
                            boolean tienePaseDescuento = scanner.next().equalsIgnoreCase("s");
                            if (tienePaseDescuento) {
                                System.out.println("¡Bienvenido, " + nombre + "! Puedes ingresar con descuento.");
                                dineroRecaudado += PRECIO_ENTRADA_NORMAL / 2;
                                aforoActual++;
                            } else {
                                System.out.print("¿Desea comprar entrada normal (n) o VIP (v)? ");
                                char tipoEntrada = scanner.next().charAt(0);
                                if (tipoEntrada == 'n') {
                                    System.out.println("¡Bienvenido, " + nombre + "! Disfruta tu entrada normal.");
                                    dineroRecaudado += PRECIO_ENTRADA_NORMAL;
                                    aforoActual++;
                                } else if (tipoEntrada == 'v') {
                                    System.out.println("¡Bienvenido, " + nombre + "! Disfruta tu entrada VIP.");
                                    dineroRecaudado += PRECIO_ENTRADA_VIP;
                                    aforoActual++;
                                } else {
                                    System.out.println("Opción no válida. No se pudo ingresar.");
                                }
                            }
                        }
                    } else {
                        System.out.println("Lo sentimos, " + nombre + ". Solo permitimos el ingreso a mayores de 21 años.");
                    }
                    break;
                case 2:
                    int capacidadDisponible = CAPACIDAD_MAXIMA - aforoActual;
                    System.out.println("Capacidad disponible: " + capacidadDisponible);
                    break;
                case 3:
                    System.out.println("Dinero recaudado: " + dineroRecaudado);
                    break;
                case 4:
                    System.out.println("Cerrando sesión en el sistema...");
                    sesionActiva = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }
        } while (sesionActiva);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gestionarBolera(scanner);
        scanner.close();
    }
}

         */



}
