package Bintroducaometodos.teste;

import Bintroducaometodos.dominio.Calculadora;

public class TestCalculadora3 {
    public static void main (String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros();
        System.out.print(result);
    }
}
