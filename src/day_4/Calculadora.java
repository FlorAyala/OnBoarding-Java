package day_4;

//implementar la interfaz
// implemenat las operaciones logicas en cada metodo de la interfaz
public class Calculadora implements CalculatorOperations {


    @Override
    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    @Override
    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    @Override
    public double multiplicacion(double num1, double num2) {
        return num1 * num2;
    }

    @Override
    public double division(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("¡Error! División por cero no permitida.");
            return Double.NaN; // NaN (No es un numero)|| .NaN es  parte de la clase Double y se utiliza para representar resultados indefinidos
        }
        return num1 / num2;

    }
}
