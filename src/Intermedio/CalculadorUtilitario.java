package Intermedio;

public class CalculadorUtilitario {
    public static <T extends Number> double sumar(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }
}
