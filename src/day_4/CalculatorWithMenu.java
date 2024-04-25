package day_4;

import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {

    @Override
    public void desplegarMenu() {
        System.out.println(opciones());
    }

    Calculadora calculadora = new Calculadora();


    private String opciones() {
        return """
                 Eliga su opcion para la operacion (presione 5 para salir)\s
                 1. Opcion 1
                 2. Opcion 2
                 3. Opcion 3
                 4. Opcion 4
                
                \s""";
    }

    @Override
    public void operacion() {
        boolean aux = false;
       while(!aux) {
            Scanner prompt = new Scanner(System.in);
            desplegarMenu();
            int opcion = prompt.nextInt();
            double num1, num2, result;
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = prompt.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = prompt.nextInt();
                    result = calculadora.suma(num1, num2);
                    System.out.println("El resultado es : " + result);
                    break;
                case 2:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = prompt.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = prompt.nextInt();
                    result = calculadora.resta(num1, num2);
                    System.out.println("El resultado es : " + result);
                    break;
                case 3:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = prompt.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = prompt.nextInt();
                    result = calculadora.multiplicacion(num1, num2);
                    System.out.println("El resultado es : " + result);
                    break;
                case 4:
                    System.out.println("Ingrese el primer numero: ");
                    num1 = prompt.nextInt();
                    System.out.println("Ingrese el segundo numero: ");
                    num2 = prompt.nextInt();
                    result = calculadora.division(num1, num2);
                    if (!Double.isNaN(result)) {
                        //devuelve verdadero si el valor es NaN ; de lo contrario, devuelve false
                        System.out.println("El resultado es : " + result);
                    }
                    break;
                case 5:
                    System.out.println("Saliendo de la calculadora...");
                   aux= true;
                    break;
                default:
                    System.out.println("Error, vuelva a ingresar otra opcion!");
                    break;
            }
        }
    }

}
